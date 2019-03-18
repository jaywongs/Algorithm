
n = input()
while True:
    try:
        s = [int(i) for i in input().split()]
        coins = [int(i) for i in input().split()]
        num, amount = s[0], s[1]
        cnt = 0
        coins.sort(reverse=True)
        while amount > 0:
            if len(coins) == 0:
                break
            while amount - coins[0] >= 0:
                amount -= coins[0]
                cnt += 1
            coins.pop(0)
        if amount == 0:
            print(cnt)
        else:
            print(-1)
    except EOFError:
        break

