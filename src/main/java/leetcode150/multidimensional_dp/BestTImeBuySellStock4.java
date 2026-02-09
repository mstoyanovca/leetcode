package leetcode150.multidimensional_dp;

import java.util.Arrays;

public class BestTImeBuySellStock4 {
    public int maxProfit(int k, int[] prices) {
        if (k == 0) return 0;

        int[] buy = new int[k];
        Arrays.fill(buy, Integer.MIN_VALUE);
        int[] profit = new int[k];

        for (int price : prices) {
            buy[0] = Math.max(buy[0], -price);
            profit[0] = Math.max(profit[0], buy[0] + price);
            for (int j = 1; j < k; j++) { // The i-th time buy & sell depens on the (i - 1)-th time buy & sell
                buy[j] = Math.max(buy[j], profit[j - 1] - price);
                profit[j] = Math.max(profit[j], buy[j] + price);
            }
        }
        return profit[k - 1];
    }
}
