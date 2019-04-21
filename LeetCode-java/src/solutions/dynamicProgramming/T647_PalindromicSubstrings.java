package solutions.dynamicProgramming;

/**
 * Created by jaywangs on 2019/4/21
 */
public class T647_PalindromicSubstrings {
    /**
     * Given a string, your task is to count how many palindromic substrings in this string.
     *
     * The substrings with different start indexes or end indexes are counted as different substrings even they
     * consist of same characters.
     *
     * Example 1:
     *
     * Input: "abc"
     * Output: 3
     * Explanation: Three palindromic strings: "a", "b", "c".
     *
     *
     * Example 2:
     *
     * Input: "aaa"
     * Output: 6
     * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
     **/

    // dp[i][j] =
    public static int countSubstrings(String S) {
        int n = S.length(), cnt = 0;
        boolean dp[][] = new boolean[n][n];
        for (int d = 0; d < n; d++) {
            for (int i = 0; i + d < n; i++){
                int j = i + d;
                if (S.charAt(i) == S.charAt(j)){
                    dp[i][j] = i+1 >= j-1 || dp[i+1][j-1];
                    if (dp[i][j]) cnt ++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
}
