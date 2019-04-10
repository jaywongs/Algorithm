package solutions.dynamicProgramming;

/**
 * created by jaywang on 2019/3/11.
 */
public class T64_MInimumPathSum {
    /**
     * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
     *
     * 说明：每次只能向下或者向右移动一步。
     *
     * 示例:
     *
     * 输入:
     * [
     *   [1,3,1],
     *   [1,5,1],
     *   [4,2,1]
     * ]
     * 输出: 7
     * 解释: 因为路径 1→3→1→1→1 的总和最小
     **/
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 1; i < m; i++)
            grid[i][0] += grid[i - 1][0];
        for (int i = 1; i < n; i++)
            grid[0][i] += grid[0][i - 1];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }

    //better solution
    public int minPathSum2(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int N = grid.length, M = grid[0].length;
        int dp[] = new int[M];
        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < M; j++) {
                if (j == 0)
                    dp[j] = dp[j];
                else if (i == 0)
                    dp[j] = dp[j - 1];
                else{
                    dp[j] = Math.min(dp[j-1], dp[j]);
                }
                dp[j] += grid[i][j];
            }
        }
        return dp[M-1];
    }

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1,3,1}, {1,5,1}, {4,2,1}}));
    }
}
