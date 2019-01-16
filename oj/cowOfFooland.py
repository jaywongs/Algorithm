
def power(a, n):
    if n == 0:
        return [[1,0], [0,1]]
    elif n == 1:
        return a
    else:
        temp = power(a, n//2)
        temp = multiply(temp, temp)
        if n%2 != 0:
            temp = multiply(temp, a)
        return temp
def multiply(a, b):
    temp = [[0,0],[0,0]]
    temp[0][0] = (a[0][0]*b[0][0] + a[0][1]*b[1][0])%mod
    temp[0][1] = (a[0][0]*b[0][1] + a[0][1]*b[1][1])%mod
    temp[1][0] = (a[1][0]*b[0][0] + a[1][1]*b[1][0])%mod
    temp[1][1] = (a[1][0]*b[0][1] + a[1][1]*b[1][1])%mod
    return temp

def fib(n):
    if n >= 0:
        a = [[1, 1], [1, 0]]
        temp = power(a, n-1)
        return temp[0][0]


t = int(input())
mod = 10**9+7
for t_c in range(t):
    n = int(input())
    print(fib(n+1))