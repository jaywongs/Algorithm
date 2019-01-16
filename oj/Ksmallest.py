import sys

def kSmallestOfScope(arr, scope, num):
    newArr = arr[int(scope[0])-1 : int(scope[1])]
    newArr.sort
    return newArr[int(num) - 1]
    for i in range(len(newArr)):newArr


arr = [int(n) for n in sys.stdin.readline().split()]
scope = sys.stdin.readline().split()
num = sys.stdin.readline()
print(kSmallestOfScope(arr, scope, num))