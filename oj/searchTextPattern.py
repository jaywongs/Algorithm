# 字符串3
# Description
#
# Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in txt[]. You may assume that n > m.
#
#
# Input
#
# 输入第一行是用例个数，后面一行表示一个用例；用例包括两部分，第一部分为给定文本，第二部分为搜索串，两部分使用","隔开。
#
#
# Output
#
# 每一个用例输出一行，每行按照找到的位置先后顺序排列，使用空格隔开。
#
#
# Sample Input 1
#
# 2
# THIS IS A TEST TEXT,TEST
# AABAACAADAABAABA,AABA
#
# Sample Output 1
#
# 10
# 0 9 12

def search(txt, pat):
    n = len(txt)
    m = len(pat)
    i, j = 0, 0
    res = []
    while i < n:
        while j < m and i < n:
            if txt[i] != pat[j]:
                i += 1
                j = 0
                break
            else:
                i += 1
                j += 1
        if j != 0:
            res.append(i - m)
            j = 0
    return res


def KMPSearch(pat, txt):
    M = len(pat)
    N = len(txt)

    # create lps[] that will hold the longest prefix suffix
    # values for pattern
    lps = [0] * M
    j = 0  # index for pat[]

    # Preprocess the pattern (calculate lps[] array)
    computeLPSArray(pat, M, lps)

    i = 0  # index for txt[]
    while i < N:
        if pat[j] == txt[i]:
            i += 1
            j += 1

        if j == M:
            res.append(str(i - j))
            j = lps[j - 1]

            # mismatch after j matches
        elif i < N and pat[j] != txt[i]:
            # Do not match lps[0..lps[j-1]] characters,
            # they will match anyway
            if j != 0:
                j = lps[j - 1]
            else:
                i += 1


def computeLPSArray(pat, M, lps):
    len = 0  # length of the previous longest prefix suffix

    lps[0]  # lps[0] is always 0
    i = 1

    # the loop calculates lps[i] for i = 1 to M-1
    while i < M:
        if pat[i] == pat[len]:
            len += 1
            lps[i] = len
            i += 1
        else:
            # This is tricky. Consider the example.
            # AAACAAAA and i = 7. The idea is similar
            # to search step.
            if len != 0:
                len = lps[len - 1]

                # Also, note that we do not increment i here
            else:
                lps[i] = 0
                i += 1

T = int(input())

for _ in range(0, T):
    string = input()
    txt = string.split(',')[0]
    pat = string.split(',')[1]
    res = []
    KMPSearch(pat, txt)
    print(' '.join(res))