while True:
    try:
        lst = []
        r = 0
        s = input().split()
        for x in s:
            lst.append(int(x))
        n = lst.pop(0)
        k = max(lst)
        res = [0 for i in range(n)]
        count = [0 for i in range(k+1)]
        for num in lst:
            count[num] += 1
        for i in range(1, len(count)):
            count[i] = count[i] + count[i-1]
        for num in lst:
            res[count[num] - 1] = num
            count[num] -= 1
        print(' '.join(str(i) for i in res))
    except EOFError:
        break