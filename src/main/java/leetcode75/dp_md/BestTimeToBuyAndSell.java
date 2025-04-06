package leetcode75.dp_md;

// problem 65:
// Best Time to Buy and Sell Stock with Transaction Fee
public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices, int fee) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;

        for (int price : prices) {
            buy = Math.max(buy, sell - price);
            sell = Math.max(sell, buy + price - fee);
        }

        return sell;
    }
}
