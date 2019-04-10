package solutions.dynamicProgramming;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/4/7
 */
public class T322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        int [] dp = new int[amount+1];
        Arrays.sort(coins);
        for (int i = 1; i <= amount; i++){
            dp[i] = 9999;
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount];
    }
}
