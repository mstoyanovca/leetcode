package leetcode150.array_string;

public class BestTimeBuySellStock1 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int sell = prices[0];
        int profit = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int price : prices) {
            if (price < buy) {
                buy = price;
            } else if (price - buy > profit) {
                profit = price - buy;
            }
        }

        return profit;
    }
}
