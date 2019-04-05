package solutions.dynamicProgramming;

/**
 * Created by jaywangs on 2019/4/5
 */
public class T5_LongestPalindromicSubstring {
    public String longestPalindromicSubstring(String str) {
        String res = null;
        int n = str.length();
        boolean [][]dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++){
                dp[i][j] = str.charAt(i) == str.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && (res == null || j - i + 1 > res.length()))
                    res = str.substring(i, j+ 1);
            }
        }
        return res;
    }
}
