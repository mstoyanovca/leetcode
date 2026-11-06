package top_interview_150.sliding_window;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int currentSum = nums[0];
        int minLength = n + 1;

        // time complexity O(n)
        // space complexity O(1)
        while (true) {
            if (currentSum < target) {
                right++;
                if (right == n) break;
                currentSum += nums[right];
            } else {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
                if (left == n) break;
                if (left > right) right = left;
            }
        }

        return minLength == n + 1 ? 0 : minLength;
    }
}
