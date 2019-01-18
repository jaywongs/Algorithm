def fibonacci(n):
    dp = [0, 1]
    if n < 2:
        return dp[n]
    fibNminusOne = 1
    fibNminusTwo = 0
    fibN = 0
    for i in range(2, n):
        fibN  = fibNminusOne + fibNminusTwo
        fibNminusTwo = fibNminusOne
        fibNminusOne = fibN
    return fibN