package solutions.dynamicProgramming;

/**
 * Created by jaywangs on 2019/4/2
 */
public class T413_numberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int n = A.length;
        int [] dp = new int [n];
        for(int i = 2; i < n; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]){
                dp[i] = dp[i - 1] + 1;
            }
        }
        int cnt = 0;
        for (int num : dp){
            cnt += num;
        }
        return cnt;
    }
}
