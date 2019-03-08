
numcase = input()
while True:
    try:
        n = int(input())
        lst = []
        for i in range(n):
            lst.append([int(n) for n in input().split()])
        prevOptimal = None

        for i in range(n):
            if prevOptimal is None:
                prevOptimal = lst[i].copy()
            else:
                newOptimal = lst[i].copy()
                newOptimal[0] += min(prevOptimal[1], prevOptimal[2])
                newOptimal[1] += min(prevOptimal[0], prevOptimal[2])
                newOptimal[2] += min(prevOptimal[0], prevOptimal[1])
                prevOptimal = newOptimal
        print(min(prevOptimal))
    except EOFError:
        break