import sys


def maxlong(li):
    maxLong = [0 for i in range(len(li))]
    maxLong[0] = li[0]
    leng = 1

    for i in range(1, len(li)):
        if li[i] > maxLong[leng - 1]:
            maxLong[leng] = li[i]
            leng += 1
        else:
            pos = biSearch(maxLong, leng, li[i])
            maxLong[pos] = li[i]
    return leng


def biSearch(li, length, value):
    left = 0
    right = length - 1
    while left <= right:
        mid = (right + left) // 2
        if li[mid] > value:
            right = mid - 1
        elif li[mid] < value:
            left = mid + 1
        else:
            return mid
    return left


def mindelete(li):
    a = [0 for i in range(len(li))]
    b = [0 for i in range(len(li))]
    c = 0
    max = 0
    min = 0
    for i in range(len(li)):
        li_a = li[:i + 1]
        a[i] = maxlong(li_a)

        li_b = li[:i:-1] + [li[i]]
        b[i] = maxlong(li_b)

    for i in range(len(li)):
        if c < a[i] + b[i]:
            c = a[i] + b[i]
    return len(li) - c + 1


arr = [int(n) for n in sys.stdin.readline().split()]
print(mindelete(arr))