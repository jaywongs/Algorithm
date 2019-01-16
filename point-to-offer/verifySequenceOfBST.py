def verifySequenveOfBST(sequence):
    if sequence is None:
        return False
    length = len(sequence) // 2
    root = sequence[-1]
    for index, element in enumerate(sequence):
        i = index
        if element > root:
            break
    for element in sequence[i:]:
        if element < root:
            return False
    left = True
    if i > 0:
        left = verifySequenveOfBST(sequence[:i])



sequence = [5, 7, 6, 9, 11, 10, 8]
print(verifySequenveOfBST(sequence))