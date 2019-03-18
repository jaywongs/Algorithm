n1 = input()
while True:
    try:
        n2 = input()
        s1 = [int(i) for i in input().split()]
        s2 = [int(i) for i in input().split()]
        n = len(s1)
        s1.sort()
        s2.sort()

        palt_needed = 1
        result = 1
        i = 1
        j = 0

        while i < n and j < n:
            if s1[i] < s2[j]:
                palt_needed += 1
                i += 1
                if palt_needed > result:
                    result = palt_needed
            else:
                palt_needed -= 1
                j += 1
        print(result)
    except EOFError:
        break

