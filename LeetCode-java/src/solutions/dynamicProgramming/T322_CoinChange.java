package solutions.greedy;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/4/7
 */
public class T322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int cnt = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]){
                amount -= coins[i];
                cnt++;
            }
        }
        if (amount == 0)
            return cnt;
        else
            return -1;
    }
}
