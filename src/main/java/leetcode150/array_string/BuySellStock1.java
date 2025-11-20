package leetcode150.array_string;

public class BuySellStock1 {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int maxProfit = 0;

        // time complexity O(n)
        // space complexity O(1)
        // looking for a global extremum;
        while (right < prices.length) {
            while (left + 1 < prices.length && prices[left + 1] < prices[left]) {
                left++;
                right = left;
            }
            while (right + 1 < prices.length && prices[right + 1] > prices[right]) {
                right++;
            }
            maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            if (right + 1 < prices.length) {
                right++;
                if (prices[right] < prices[left]) left = right;
            } else {
                break;
            }
        }

        return maxProfit;
    }
}
