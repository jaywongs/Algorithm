# 整除查询
# Description
#
# Given an array of positive integers and many queries for divisibility. In every query Q[i], we are given an integer K , we need to count all elements in the array which are perfectly divisible by K.
#
# Constraints:1<=T<=1001<=N,M<=1051<=A[i],Q[i]<=105
#
#
# Input
#
# The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of three lines. First line of each test case contains two integers N & M, second line contains N space separated array elements and third line contains M space separated queries.
#
#
# Output
#
# For each test case,In new line print the required count for each query Q[i].
#
#
# Sample Input 1
#
# 2
# 6 3
# 2 4 9 15 21 20
# 2 3 5
# 3 2
# 3 4 6
# 2 3
# Sample Output 1
#
# 3 3 2
# 2 2

def countSieve(arr, dividors):
    Max = max(arr)
    ans = [0] * (Max + 1)
    cnt = [0] * (Max + 1)
    for i in range(len(arr)):
        cnt[arr[i]] += 1

    for i in range(1, Max + 1):
        for j in range(i, Max + 1, i):
            ans[i] += cnt[j]

    res = []
    for i in dividors:
        res.append(str(ans[i]))
    return ' '.join(res)


n = int(input())
# for i in range(n):
#     lengthArr = [int(x) for x in input().split()]
#     arr = [int(x) for x in input().split()]
#     dividors = [int(x) for x in input().split()]
#     print(countSieve(arr, dividors))
while True:
    try:
        lengthArr = [int(x) for x in input().split()]
        arr = [int(x) for x in input().split()]
        dividors = [int(x) for x in input().split()]
        print(countSieve(arr, dividors))
    except EOFError:
        break