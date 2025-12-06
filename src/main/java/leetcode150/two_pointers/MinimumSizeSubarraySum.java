package leetcode150.two_pointers;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = nums[0];
        int result = n + 1;

        // time complexity O(n)
        // space complexity O(1)
        while (left < n && right < n) {
            if (sum >= target) {
                result = Math.min(result, right - left + 1);
                if (left < n - 1) sum -= nums[left];
                left++;
            } else {
                if (right < n - 1) sum += nums[right + 1];
                right++;
            }
        }

        return result == n + 1 ? 0 : result;
    }
}
