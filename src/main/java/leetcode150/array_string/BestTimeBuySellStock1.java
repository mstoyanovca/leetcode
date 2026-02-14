package leetcode150.array_string;

public class BestTimeBuySellStock1 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0;
        int right = 0;
        int maxProfit = 0;

        // time complexity O(n)
        // space complexity O(1)
        // find a global extremum:
        while (right < n) {
            // slide the left pointer downhill to the next local minimum:
            while (left + 1 < n && prices[left + 1] < prices[left]) {
                left++;
                // can't sell before buy:
                right = left;
            }
            // slide the right pointer uphill to the next local maximum:
            while (right + 1 < n && prices[right + 1] > prices[right]) {
                right++;
            }
            maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            if (right + 1 < n) {
                // move the right pointer downhill, expecting new local maximum after that:
                right++;
                // it might be a global minimum:
                if (prices[right] < prices[left]) left = right;
            } else {
                break;
            }
        }

        return maxProfit;
    }
}
