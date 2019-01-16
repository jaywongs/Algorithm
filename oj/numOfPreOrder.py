import sys

def numPreOrder(length, arr):
    res = 0
    for i in range(length):
        for j in range(i+1, length, 1):
            if arr[i] > arr[j]:
                res += 1
    return res


case = int(sys.stdin.readline())
for i in range(case):
    length = int(sys.stdin.readline())
    arr = [int(n) for n in sys.stdin.readline().split()]
    print(numPreOrder(length, arr))