package solutions.dynamicProgramming;

/**
 * Created by jaywangs on 2019/4/4
 */
public class cutMemo {
    public int cutMemo(int []p) {
        int [] dp = new int[p.length];
        dp[0] = p[0];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < i; j++)
                dp[i] = Math.max(dp[i], dp[j] + dp[i - j]);
        }

        return dp[p.length];
    }
}
