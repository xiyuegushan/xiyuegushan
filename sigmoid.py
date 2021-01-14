# coding:utf-8
import matplotlib.pyplot as plt
import os
import numpy as np


def sigmoid():
    # 采样
    x = np.linspace(-10, 10, 500)
    y = 1.0 / (1 + np.exp(-x))

    fig = plt.figure()
    ax = fig.add_subplot(1, 1, 1)
    ax.set(title="sigmoid", xlabel="x", ylabel="y=f(x)")
    # 设置线宽和颜色
    ax.plot(x, y, linewidth=2.0, color="blue")
    # 保存图片到磁盘
    plt.savefig("./sigmoid.png", format="png")
    # 显示
    plt.show()


if __name__ == "__main__":
    sigmoid()