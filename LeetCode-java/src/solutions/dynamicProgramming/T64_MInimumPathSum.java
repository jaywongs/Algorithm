package solutions.dynamicProgramming;

/**
 * created by jaywang on 2019/3/11.
 */
public class T64_MInimumPathSum {
    public int minPathSum(int[][] grid) {
//        if (grid == null || grid.length == 0 || grid[0].length == 0)
//            return 0;
//        int N = grid.length, M = grid[0].length;
//        int dp[] = new int[N];
//        for (int i = 0; i < N; i ++) {
//            for (int j = 0; j < M; j++) {
//                if (j == 0)
//                    dp[j] = dp[j];
//                else if (i == 0)
//                    dp[j] = dp[j - 1];
//                else
//                    dp[j] = Math.min(dp[j-1] + grid[i][j], dp[j-1]);
//            }
//            dp[j] += grid[i][j];
//        }
//        return dp[M-1]
        return 0;
    }
}
