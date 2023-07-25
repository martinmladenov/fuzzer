#!/usr/bin/env python3

import pandas as pd
from sklearn.tree import DecisionTreeClassifier, export_text
from random import randint, seed
import subprocess
from io import StringIO
import matplotlib.pyplot as plt
import numpy as np

def get_data():
    csv_raw = subprocess.run(['java', '-cp', 'target/generator.jar',
                              'io.github.martinmladenov.fuzzer.TestValidity',
                              str(randint(1, 10000))], stdout=subprocess.PIPE)
    csv = csv_raw.stdout.decode('utf-8')
    data = pd.read_csv(StringIO(csv))

    features = list(data.columns)
    assert features[-1] == 'label'
    assert len(features) == 33

    return data

def get_confidence(tree, node_id):
    weights = tree.value[node_id]
    l, r = weights[0]
    actual_confidence = max(l, r) / (l+r)
    return actual_confidence

def should_generate_more(tree, node_id):
    weights = tree.value[node_id]
    l, r = weights[0]
    actual_confidence = get_confidence(tree, node_id)

    confidence_threshold = 0.7
    min_threshold = 10
    return abs(l-r) < min_threshold or actual_confidence < confidence_threshold

def generate_more(old_data, feature, value):
    print(f"Generating more with {feature} = {value}")
    data = get_data()
    filtered_data = data[data[feature] == value]
    merged = pd.concat([old_data, filtered_data], ignore_index=True)
    
    print(f"Generated {len(filtered_data)}, total {len(merged)}")

    return merged

def main():
    seed(42) # set random state for reproducibility

    # get 1000 initial rows
    data = get_data()
    features = list(data.columns)[:-1]

    iteration = 0
    conf_log = []
    node_log = []
    while True:
        iteration += 1
        print(f"---\nIteration {iteration}")

        X = data.copy()
        y = X.pop('label')

        clf = DecisionTreeClassifier(random_state=randint(0, 10000), max_depth=5)
        clf.fit(X, y)

        # t = export_text(clf, feature_names=features, show_weights=True, decimals=0)
        # print(t)

        tree = clf.tree_

        selected_node_id = None
        selected_label = None
        min_confidence = 2**8

        for node_id in range(0, tree.node_count):
            left_child_id = tree.children_left[node_id]
            right_child_id = tree.children_right[node_id]

            if left_child_id == right_child_id:
                # leaf node
                continue
            
            if tree.children_left[left_child_id] == tree.children_right[left_child_id]:
                # left child is leaf
                confidence = get_confidence(tree, left_child_id)
                if confidence < min_confidence:
                    min_confidence = confidence
                    if should_generate_more(tree, left_child_id):
                            selected_node_id = left_child_id
                            selected_label = 0
            
            if tree.children_left[right_child_id] == tree.children_right[right_child_id]:
                # right child is leaf
                confidence = get_confidence(tree, right_child_id)
                if confidence < min_confidence:
                    min_confidence = confidence
                    if should_generate_more(tree, right_child_id):
                        selected_node_id = right_child_id
                        selected_label = 1

        print("Confidence:", min_confidence)
        conf_log.append(min_confidence)
        print("Number of nodes:", tree.node_count)
        node_log.append(tree.node_count)

        if not selected_node_id:
            t = export_text(clf, feature_names=features, show_weights=True, decimals=0)
            print(t)
            break

        feature = features[tree.feature[node_id]]
        data = generate_more(data, feature, selected_label)

    fig, ax = plt.subplots()
    ax.set(xlabel='Iteration',title='Minimum condifence score and number of nodes per iteration')

    ax.plot(np.arange(1, iteration+1), conf_log, color="blue")
    ax.set_ylabel(ylabel='Minimum confidence', color="blue")

    ax2 = ax.twinx()
    ax2.plot(np.arange(1, iteration+1), node_log, color="grey")
    ax2.set_ylabel(ylabel='Number of nodes', color="grey")

    ax.grid()

    fig.savefig("confidence.pdf")

    

if __name__ == "__main__":
    main()
