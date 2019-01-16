def merge(left, right): # 占用额外空间
    result = []
    while left and right:
        if left[0] <= right[0]:
            result.append(left.pop(0))
        else:
            result.append(right.pop(0))
    if left:
        result += left
    if right:
        result += right
    return result


def merge_sort(L):
    size = 1
    while size < len(L):
        l = 0
        while l + size < len(L):
            m = l + size
            h = m + size
            if h > len(L):
                h = len(L)
            L[l:h] = merge(L[l:m], L[m:h])
            l = h
        size *= 2


while True:
    try:
        lst = []
        r = 0
        s = input().split()
        for x in s:
            lst.append(int(x))
        n = lst.pop(0)
        merge_sort(lst)
        print(' '.join(str(i) for i in lst))
    except EOFError:
        break