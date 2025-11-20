package leetcode150.array_string;

public class BuySellStock2 {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int profit = 0;

        // time complexity O(n)
        // space complexity O(1)
        // looking for the sum of all local extremums, bigger than, or equal to one global extremum;
        while (right < prices.length) {
            while (left + 1 < prices.length && prices[left + 1] < prices[left]) {
                left++;
                right = left;
            }
            while (right + 1 < prices.length && prices[right + 1] > prices[right]) {
                right++;
            }
            profit += prices[right] - prices[left];
            if (right + 1 < prices.length) {
                right++;
                left = right;
            } else {
                break;
            }
        }

        return profit;
    }
}
