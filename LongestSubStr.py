# Given a string, find the length of the longest substring without repeating characters.
#
# Example 1:
#
# Input: "abcabcbb"
# Output: 3
# Explanation: The answer is "abc", with the length of 3.
# Example 2:
#
# Input: "bbbbb"
# Output: 1
# Explanation: The answer is "b", with the length of 1.
# Example 3:
#
# Input: "pwwkew"
# Output: 3
# Explanation: The answer is "wke", with the length of 3.
#              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

class Solution:
    def lengthOfLongestSubstring(s):
        """
        :type s: str
        :rtype: int
        """
        dict = {}
        maxSofar = curMax = start = 0
        for index, i in enumerate(s):
            if i in dict and dict[i] >= start:
                maxSofar = max(curMax, maxSofar)
                curMax = index - dict[i]
                start = dict[i] + 1
            else:
                curMax += 1
            dict[i] = index
        return max(curMax, maxSofar)

    s = "pwwkew"
    print(lengthOfLongestSubstring(s))