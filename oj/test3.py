MAX = 100000
pb = [True] * MAX
p = [2]
dp = [0] * MAX
dp[2*4] = 1
for i in range(3, MAX, 2):
    if pb[i]:
        if i*i < MAX:
            for k in range(i+i, MAX, i):
                pb[k] = False
        for j in p:
            if i != j and i*j < MAX:
                dp[i*j] += 1
            if i*j >= MAX:
                break
        if i**4 < MAX:
            dp[i**4] += 1
        p += [i]
for i in range(1, MAX):
    dp[i] += dp[i-1]

t = int(input())
for _ in range(t):
    n = int(input())
    print(dp[int(n**0.5)])