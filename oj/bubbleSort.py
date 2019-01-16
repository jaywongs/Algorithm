while True:
    try:
        lst = []
        r = 0
        s = input().split()
        for x in s:
            lst.append(int(x))
        n = lst.pop(0)
        for i in range(n-1):
            for j in range(n-1, i, -1):
                if lst[j] < lst[j-1]:
                    lst[j], lst[j-1] = lst[j-1], lst[j]
        print(' '.join(str(i) for i in lst))
    except EOFError:
        break