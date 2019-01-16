class Solution:
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        start, end = 0, 0
        for i, value in enumerate(s):
            len1 = self.expandAroundCenter(s, i, i)
            len2 = self.expandAroundCenter(s, i, i + 1)
            length = max(len1, len2)
            if length > end - start + 1:
                start = int(i - (length - 1) / 2)
                end = int(i + length / 2)
        return s[start:end + 1]

    def expandAroundCenter(s, l, r):
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1
        return r - l - 1

sol = Solution()
print(sol.longestPalindrome("dabac"))
# print(Solution.longestPalindrome("dabac"))