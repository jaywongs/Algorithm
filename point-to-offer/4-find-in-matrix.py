def findInMatrix(matrix, num):
    if not isinstance(matrix, list) or len(matrix) == 0 or \
            not isinstance(matrix[0], list) or not isinstance(num, int):
        return False
    
    row = len(matrix)
    col = len(matrix[0])
    for i in range(row):
        if len(matrix[i]) != col:
            return False
        
        for j in range(col):
            if not isinstance(matrix[i][j], int):
                return False

    i, j = row - 1, 0
    while i >= 0 and j < col:
        if matrix[i][j] == num:
            return True
        elif matrix[i][j] > num:
            i -= 1
        elif matrix[i][j] < num:
            j += 1
    return False
    

if __name__ == '__main__':
    m = [[1, 2, 8, 9],
         [2, 4, 9, 12],
         [4, 7, 10, 13],
         [6, 8, 11, 15]]
    print(findInMatrix(m, ))