def Mod(a, b, c):
    if a == 0:
        return 0
    if b == 0:
        return 1
    elif b % 2 == 0:
        y = Mod(a, b / 2, c)
        return (y * y) % c
    else:
        return (a % c * Mod(a, b - 1, c)) % c


n = input()
while True:
    try:
        s = [int(i) for i in input().split()]
        a, b, c = s[0], s[1], s[2]
        print(Mod(a, b, c))
    except EOFError:
        break
