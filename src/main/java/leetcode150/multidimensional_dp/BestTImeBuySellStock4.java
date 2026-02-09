package leetcode150.multidimensional_dp;

import java.util.Arrays;

public class BestTImeBuySellStock4 {
    // time complexity O(n * k)
    // space complexity O(k)
    public int maxProfit(int k, int[] prices) {
        if (k == 0) return 0;

        int[] buy = new int[k];
        Arrays.fill(buy, Integer.MAX_VALUE);
        int[] profit = new int[k];

        for (int price : prices) {
            buy[0] = Math.min(buy[0], price);
            profit[0] = Math.max(profit[0], price - buy[0]);
            for (int i = 1; i < k; i++) {
                buy[i] = Math.min(buy[i], price - profit[i - 1]);
                profit[i] = Math.max(profit[i], price - buy[i]);
            }
        }

        return profit[k - 1];
    }
}
