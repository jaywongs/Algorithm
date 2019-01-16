def quick_sort(array, l, r):
    if l < r:
        q = partition(array, l, r)
        quick_sort(array, l, q - 1)
        quick_sort(array, q + 1, r)


def partition(array, l, r):
    x = array[r]
    i = l - 1
    for j in range(l, r):
        if array[j] <= x:
            i += 1
            array[i], array[j] = array[j], array[i]
    array[i + 1], array[r] = array[r], array[i + 1]
    return i + 1


def quicksort(array):
    if len(array) < 2:
        return array
    else:
        pivot_index = 0 #选择第一个元素作为pivot
        pivot = array[pivot_index]
        left_part = [i for i in array[pivot_index+1:] if i < pivot]
        right_part = [i for i in array[pivot_index+1:] if i > pivot]
        return quicksort(left_part) + [pivot] + quicksort(right_part)

def quick_sort_unecursive(array, l, r):
    if l >= r:
        return
    stack = []
    stack.append(l)
    stack.append(r)
    while stack:
        low = stack.pop(0)
        high = stack.pop(0)
        if high - low <= 0:
            continue
        x = array[high]
        i = low - 1
        for j in range(low, high):
            if array[j] <= x:
                i += 1
                array[i], array[j] = array[j], array[i]
        array[i + 1], array[high] = array[high], array[i + 1]
        stack.extend([low, i, i + 2, high])
    return array

while True:
    try:
        lst = []
        s = input().split()
        for x in s:
            lst.append(int(x))
        n = lst.pop(0)
        lst = quick_sort_unecursive(lst, 0, n-1)
        print(' '.join(str(i) for i in lst))
    except EOFError:
        break