package solutions.dynamicProgramming;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/4/8
 */
public class T931_MinimumFallingPathSum {
    /**
     * 给定一个方形整数数组 A，我们想要得到通过 A 的下降路径的最小和。
     *
     * 下降路径可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列。
     *
     *
     *
     * 示例：
     *
     * 输入：[[1,2,3],[4,5,6],[7,8,9]]
     * 输出：12
     * 解释：
     * 可能的下降路径有：
     * [1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]
     * [2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]
     * [3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]
     * 和最小的下降路径是 [1,4,7]，所以答案是 12。
     *
     *
     *
     * 提示：
     *
     * 1 <= A.length == A[0].length <= 100
     * -100 <= A[i][j] <= 100
     **/
    public static int minFallingPathSum(int[][] A) {
        if (A == null || A.length == 0 || A[0] == null || A[0].length == 0)
            return 0;
        int n = A.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++){
                A[i][j] += Math.min(A[i - 1][j != 0 ? j - 1 : 0], Math.min(A[i - 1][j], A[i - 1][j == n - 1 ? j : j + 1]));
            }
        }
        int min = A[n-1][0];
        for (int i = 0; i < n; i++)
            min = Math.min(min, A[n-1][i]);
//        min = Arrays.stream(A[A.length - 1]).min().getAsInt();
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minFallingPathSum(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
    }
}
