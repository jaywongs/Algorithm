package chapterAll;

/**
 * Created by jaywangs on 2019/3/2
 */
public class T63_maxProfit {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int sofarMin = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            sofarMin = Math.min(sofarMin, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - sofarMin);
        }
        return maxProfit;
    }
}
