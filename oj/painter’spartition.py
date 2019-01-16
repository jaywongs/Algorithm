def partition(boards, n, k):
    lo = max(boards)
    hi = sum(boards)

    while (lo < hi):
        mid = int(lo + (hi - lo) / 2)
        requiredPainters = numberOfPainter(boards, n, mid)
        if requiredPainters <= k:
            hi = mid
        else:
            lo = mid + 1

    return lo


def numberOfPainter(arr, n, maxLen):
    total = 0
    numPainter = 1

    for i in range(0, n):
        total += arr[i]
        if total > maxLen:
            total = arr[i]
            numPainter += 1

    return numPainter


T = int(input())
for _ in range(T):
    input2 = [int(s) for s in input().split()]
    boards = [int(s) for s in input().split()]
    k, n = input2[0], input2[1]
    print(partition(boards, n, k))
