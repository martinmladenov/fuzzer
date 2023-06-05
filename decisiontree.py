#!/usr/bin/env python3

import pandas as pd
from sklearn.tree import DecisionTreeClassifier, export_text
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score

data = pd.read_csv('results.csv')

X = data.copy()
y = X.pop('label')

features = list(X.columns)

X_train, X_test, y_train, y_test = train_test_split(X, y, random_state = 42) # set random state for reproducibility


clf = DecisionTreeClassifier(random_state=42, max_depth=4)
clf.fit(X_train, y_train)

t = export_text(clf, feature_names=features)
print(t)


predictions = clf.predict(X_test)
print("Accuracy:", accuracy_score(y_test, predictions))
