package solutions.dynamicProgramming;

/**
 * Created by jaywangs on 2019/4/5
 */
public class InsertLeastCharToMakePalindromic {
    public static int insertLeastCharToMakePalindromic(String str) {
        char [] C = str.toCharArray();
        int n = C.length;
        int dp[][] = new int[n][n];
        for(int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j)
                    dp[i][j] = 0;
                else if (C[i] == C[j]) {
                    dp[i][j] = dp[i+1][j-1];
                }else {
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j-1]) + 1;
                }
            }
        }
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(insertLeastCharToMakePalindromic("bbaacbbv"));
    }
}
