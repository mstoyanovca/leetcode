package leetcode150.kadane;

public class MaximumSumCircularSubarray {
    // the max subarray sum for a circular array = total sum - minimum sum
    public int maxSubarraySumCircular(int[] nums) {
        // it can be merged into a single iteration for O(n) time efficiency, now it is O(3*n) :)
        // readability trumps efficiency, unless you introduce a major bottleneck;
        // time efficiency is still O(n) after all
        int maxSum = maxSum(nums);
        int minSum = minSum(nums);
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) totalSum += nums[i];
        int circularSum = totalSum - minSum;

        return circularSum == 0 ? maxSum : Math.max(maxSum, circularSum);
    }

    private int maxSum(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    private int minSum(int[] nums) {
        int currentSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.min(nums[i], currentSum + nums[i]);
            minSum = Math.min(minSum, currentSum);
        }

        return minSum;
    }
}
