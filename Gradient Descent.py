from sklearn import datasets
from sklearn import model_selection
from sklearn import linear_model
import numpy as np
import pandas as pd
# 加载数据集
X = []
Y = []
cancer = np.array(pd.read_csv('data.csv'))
for data in cancer:
  X.append(data[0:2])  # 样本
  Y.append(data[2])  # 标签
# 划分数据集
X_trainer = X
Y_trainer = Y
lr = linear_model.LogisticRegression()
lr.fit(X_trainer, Y_trainer)  # 训练
result = int(lr.predict([[2, 6]]))  # 测试,对(2,6)的结果进行预测
print('预测结果:', result)

