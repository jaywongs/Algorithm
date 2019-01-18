def find_path_in_matrix(matrix, string):
    if not isinstance(matrix, list) or len(matrix) == 0 or len(matrix[0]) == 0 or \
            not isinstance(string, str) or len(string) == 0:
        return False

    rows = len(matrix)
    cols = len(matrix[0])
    for r in matrix:
        if not isinstance(r, list) or len(r) != cols:
            return False

    visited = [[False] * cols for _ in range(rows)]
    for i in range(rows):
        for j in range(cols):
            # 找到头结点
            if matrix[i][j] == string[0]:
                visited[i][j] = True
                # 递归寻找下一个字符
                found = find_recursively(matrix, string[1:], visited, (i, j))
                if found:
                    for r in visited:
                        print(r)
                    return True
                visited[i][j] = False


def find_recursively(matrix, string, visited, matrix_indices):
    if len(string) <= 0:
        return True

    m_i, m_j = matrix_indices
    indices = []
    for delta in (-1, 1):
        if m_i + delta < len(matrix) and not visited[m_i + delta][m_j]:
            indices.append((m_i + delta, m_j))
        if m_j + delta < len(matrix[0]) and not visited[m_i][m_j + delta]:
            indices.append((m_i, m_j + delta))

    for next_m_i, next_m_j in indices:
        if matrix[next_m_i][next_m_j] == string[0]:
            visited[next_m_i][next_m_j] = True
            found = find_recursively(matrix, string[1:], visited, (next_m_i, next_m_j))
            if found:
                return True
            visited[next_m_i][next_m_j] = False


if __name__ == "__main__":
    matrix = [
        ["a", "b", "t", "g"],
        ["c", "f", "c", "s"],
        ["j", "d", "e", "h"]
    ]
    string = "gtceh"
    print(find_path_in_matrix(matrix=matrix, string=string))