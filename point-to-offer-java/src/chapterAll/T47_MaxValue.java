package chapterAll;

/**
 * Created by jaywangs on 2019/2/26
 */
public class T47_MaxValue {

    public int getMaxValue(int [][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int [][] max = new int[m][n];
        max[0][0] = grid[0][0];
        for (int j = 1; j < n; j++)
            max[0][j] = max[0][j-1] + grid[0][j];
        for (int i = 1; i < m; ++i)
            max[i][0] = max[i - 1][0] + grid[i][0];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                max[i][j] = Math.max(max[i-1][j], max[i][j-1]) + grid[i][j];
            }
        }
        return max[m-1][n-1];
    }
}
