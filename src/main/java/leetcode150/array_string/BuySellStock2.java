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
            // slide the left pointer downhill to the next local minimum:
            while (left + 1 < prices.length && prices[left + 1] < prices[left]) {
                left++;
                right = left;
            }
            // slide the right pointer uphill to the next local maximum:
            while (right + 1 < prices.length && prices[right + 1] > prices[right]) {
                right++;
            }
            // profit from this local minimum/local maximum differential:
            profit += prices[right] - prices[left];
            if (right + 1 < prices.length) {
                // move the right pointer downhill, expecting new local maximum after that:
                right++;
                // set current profit to 0, only local maximum - local minimum counts:
                left = right;
            } else {
                break;
            }
        }

        return profit;
    }
}
