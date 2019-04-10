package solutions.greedy;

/**
 * Created by jaywangs on 2019/4/7
 */

/**
 *有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
 *
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 *
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 *
 * 返回尽可能高的分数。
 *
 *
 *
 * 示例：
 *
 * 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * 输出：39
 * 解释：
 * 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
 * 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 *
 *
 * 提示：
 *
 * 1 <= A.length <= 20
 * 1 <= A[0].length <= 20
 * A[i][j] 是 0 或 1
 **/

public class T861_ScoreAfterFlippingMatrix {
    public static int matrixScore(int[][] A) {
        int r = A.length, c = A[0].length;
        for (int i = 0; i < r; i++) {
            if (A[i][0]  == 0){
                for (int j = 0; j < c; j++)
                    A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }

        for (int j = 1; j < c; j++){
            int cnt = 0;
            for (int i = 0; i < r; i++){
                if (A[i][j] == 1)
                    cnt++;
            }
            if (cnt <= r >> 1){
                for (int i = 0; i < r; i++)
                    A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }

        int sum = 0;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (A[i][j] == 1)
                    sum += Math.pow(2, c - j - 1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(matrixScore(new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}}));
    }
}
