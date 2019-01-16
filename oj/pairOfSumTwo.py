import sys

def findPair(arr, num):
    res = 0
    for i in range(len(arr)):
        if num - arr[i] in arr:
            res += 1
    return int(res / 2)


arr = [int(n) for n in sys.stdin.readline().split()]
num = int(sys.stdin.readline())
print(findPair(arr, num))