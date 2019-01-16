import sys


def minm(arr):
    total = sum(arr)
    half = int(total / 2)
    n = int(len(l) / 2)

    dp = [[False for col in range(half + 1)] for row in range(n + 1)]
    dp[0][0] = True
    for k in range(1, n * 2):
        val = l[k - 1]
        for i in range(1, n + 1):
            if i <= k:
                for j in range(1, half + 1):
                    if j >= val and dp[i - 1][j - val]:
                        dp[i][j] = True

    for i in range(half, 0, -1):
        if dp[n][i]:
            return total - 2 * i
    return 0


li = [int(n) for n in sys.stdin.readline().strip().split()]
l = [int(n) for n in sys.stdin.readline().strip().split()]
l.extend(li)

print(minm(l))
