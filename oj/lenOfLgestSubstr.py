# 字符串1
# Description
#
# Given a string ‘str’ of digits, find length of the longest substring of ‘str’, such that the length of the substring is 2k digits and sum of left k digits is equal to the sum of right k digits.
#
#
# Input
#
# 输入第一行是测试用例的个数，后面每一行表示一个数字组成的字符串，例如："123123"
#
#
# Output
#
# 输出找到的满足要求的最长子串的长度。例如，给定的例子长度应该是 6。每行对应一个用例的结果。
#
#
# Sample Input 1
#
# 1
# 1538023
# Sample Output 1
#
# 4
# A O(n^2) time and O(n) extra
# space solution
def findLength(st, n):
    # To store cumulative total from
    # first digit to nth digit
    total = [0] * (n + 1)

    # Store cumulative total of digits
    # from first to last digit
    for i in range(1, n + 1):
        # convert chars to int
        total[i] = (total[i - 1] +
                    int(st[i - 1]) - int('0'))

    ans = 0  # initialize result

    # consider all even length
    # substings one by one
    l = 2
    while (l <= n):

        for i in range(n - l + 1):

            j = i + l - 1

            # total of first and second half
            # is same than update ans
            if (total[i + int(l / 2)] - total[i] == total[i + l] - total[i + int(l / 2)]):
                ans = max(ans, l)
        l = l + 2

    return ans


n = input()
while True:
    try:
        str = input()
        n = len(str)
        print(findLength(str, n))
    except EOFError:
        break