package top_interview_150.array_string;

public class BestTimeBuySellStock2 {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int price : prices) {
            if (price < minBuy) {
                minBuy = price;
            } else {
                maxProfit += price - minBuy;
                minBuy = price;
            }
        }

        return maxProfit;
    }
}
