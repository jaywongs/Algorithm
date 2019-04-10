package solutions.greedy;

/**
 * Created by jaywangs on 2019/4/7
 */
public class T714_BestTimetoBuyandSellStockwithTransactionFee {
    // 贪婪解法
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        if (len == 0 || len == 1) return 0;
        int min = prices[0];
        int max = prices[0];
        int cur = 0, sum = 0;
        for (int i = 1; i < len; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i]);
            cur = Math.max(cur, prices[i] - min - fee);
            if (max - prices[i] > fee) {
               sum += cur;
               min = prices[i];
               max = prices[i];
               cur = 0;
            }
        }
        sum += cur;
        return sum;
    }

    // 动态规划解法
    public int maxProfit2(int[] prices, int fee) {
        int cash = 0, hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }
}
