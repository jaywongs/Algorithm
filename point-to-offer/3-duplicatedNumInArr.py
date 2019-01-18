def duplicatednumINArr(lst):

    if not isinstance(lst, list) or len(lst) <= 0:
        return False, None

    for num in lst:
        if not isinstance(num, int) or num >= len(lst) or num < 0:
            return False, None

    for i in range(len(lst)):
        m = lst[i]
        if i == m:
            continue
        elif m == lst[m]:
            return m
        else:
            lst[i] = lst[m]
            lst[m] = m


if __name__ == "__main__":
    print(duplicatednumINArr([2, 3, 1, 0, 2, 5 ,3]))