package leetcode150.two_pointers;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int result = n + 1;

        while (left < n && right < n) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += nums[i];
            }
            if (sum >= target) {
                result = Math.min(result, right - left + 1);
                left++;
            } else {
                right++;
            }
        }

        return result == n + 1 ? 0 : result;
    }
}
