



n = int(input())
while True:
    try:
        lst = []
        lst = [int(x) for x in input().split()]
        k = lst[0]

        steps = [int(x) for x in input().split()]
        print(' '.join(str(i) for i in lst))
    except EOFError:
        break