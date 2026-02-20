package top_interview_150.array_string;

public class BestTimeBuySellStock2 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int price : prices) {
            if (price < buy) {
                buy = price;
            } else if (price - buy > 0) {
                profit += price - buy;
                buy = price;
            }
        }

        return profit;
    }
}
