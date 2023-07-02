#!/usr/bin/env python3

import pandas as pd
from sklearn.tree import DecisionTreeClassifier, export_text
from random import randint, seed
import subprocess
from io import StringIO

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

def should_generate_more(tree, node_id):
    weights = tree.value[node_id]
    l, r = weights[0]
    return abs(l-r) < 1 # threshold

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
    while True:
        iteration += 1
        print(f"---\nIteration {iteration}")

        X = data.copy()
        y = X.pop('label')

        clf = DecisionTreeClassifier(random_state=randint(0, 10000))
        clf.fit(X, y)

        # t = export_text(clf, feature_names=features, show_weights=True, decimals=0)
        # print(t)

        tree = clf.tree_

        generated = False

        for node_id in range(0, tree.node_count):
            left_child_id = tree.children_left[node_id]
            right_child_id = tree.children_right[node_id]

            if left_child_id == right_child_id:
                # leaf node
                continue
            
            if tree.children_left[left_child_id] == tree.children_right[left_child_id]:
                # left child is leaf
                if should_generate_more(tree, left_child_id):
                    feature = features[tree.feature[node_id]]
                    data = generate_more(data, feature, 0)
                    generated = True
                    break
            
            if tree.children_left[right_child_id] == tree.children_right[right_child_id]:
                # right child is leaf
                if should_generate_more(tree, right_child_id):
                    feature = features[tree.feature[node_id]]
                    data = generate_more(data, feature, 1)
                    generated = True
                    break
            

        if not generated:
            break
    

if __name__ == "__main__":
    main()
