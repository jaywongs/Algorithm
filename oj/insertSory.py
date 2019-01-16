while True:
    try:
        lst = []
        r = 0
        s = input().split()
        for x in s:
            lst.append(int(x))
        n = lst.pop(0)
        for i in range(1, n):
            for j in range(i, 0, -1):
                if lst[j] < lst[j - 1]:
                    lst[j], lst[j-1] = lst[j-1], lst[j]
                else:
                    break
        print(' '.join(str(i) for i in lst))
    except EOFError:
        break