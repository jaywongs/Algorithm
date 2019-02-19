'''
实现Shell排序
Description

实现Shell排序，对给定的无序数组，按照给定的间隔变化（间隔大小即同组数字index的差），打印排序结果，注意不一定是最终排序结果！


Input

输入第一行表示测试用例个数，后面为测试用例，每一个用例有两行，第一行为给定数组，第二行为指定间隔，每一个间隔用空格隔开。


Output

输出的每一行为一个用例对应的指定排序结果。


Sample Input 1

1
49 38 65 97 76 13 27 49 55 4
5 3
Sample Output 1

13 4 49 38 27 49 55 65 97 76
'''


def shellSort(lst, steps):
    n = len(lst)
    for step in steps:
        for i in range(step, n):
            temp = lst[i]
            j = i
            # 插入排序
            while j >= step and lst[j - step] > temp:
                lst[j] = lst[j - step]
                j -= step
            lst[j] = temp
    return lst


n = int(input())
while True:
    try:
        lst = []
        lst = [int(x) for x in input().split()]
        steps = [int(x) for x in input().split()]
        # print(' '.join(str(i) for i in lst))
        lst = shellSort(lst, steps)
        print(' '.join(str(i) for i in lst))
    except EOFError:
        break