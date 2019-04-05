package solutions.dynamicProgramming;

/**
 * Created by jaywangs on 2019/4/4
 */
public class cutMemo {
    public static int cutMemo(int []p) {
        int [] dp = new int[p.length + 1];
        for (int i = 1; i <= p.length; i++) {
            for (int j = 1; j <= i; j++)
                dp[i] = Math.max(dp[i], p[j - 1] + dp[i - j]);
        }

        return dp[p.length];
    }

    public static void main(String[] args) {
        System.out.println(cutMemo(new int [] {1,5,8,9,10,17,17,20,24}));

    }
}
