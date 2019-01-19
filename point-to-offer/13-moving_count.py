def moving_count(matrix, k):
    if not isinstance(matrix, list) or len(matrix) == 0 or \
            not isinstance(matrix[0], list) or len(matrix[0]) == 0:
        return False

    rows = len(matrix)
    cols = len(matrix[0])
    for r in matrix:
        if len(r) != len(matrix[0]):
            return False

    visited = [[False] * cols for _ in range(rows)]
    count = count_recursively(matrix, k, (0, 0), visited)
    return count


def count_recursively(matrix, k, matrix_indices, visited):
    m_i, m_j = matrix_indices
    count = 0
    if check(matrix, k, (m_i, m_j), visited):
        count = 1 + count_recursively(matrix, k, (m_i - 1, m_j), visited) + \
                count_recursively(matrix, k, (m_i + 1, m_j), visited) + \
                count_recursively(matrix, k, (m_i, m_j - 1), visited) + \
                count_recursively(matrix, k, (m_i, m_j + 1), visited)
    return count


def check(matrix, k, matrix_indices, visited):
    m_i, m_j = matrix_indices
    if 0 <= m_i < len(matrix) and 0 <= m_j < len(matrix[0]) and not visited[m_i][m_j]:
        visited[m_i][m_j] = True
        if sumNum(m_i) + sumNum(m_j) < k:
            return True
    return False


def sumNum(num):
    sum = 0
    while num != 0:
        sum += num % 10
        num //= 10
    return sum


if __name__ == '__main__':
    matrix = [[0] * 20 for _ in range(20)]
    print(matrix)
    print(moving_count(matrix, 7))