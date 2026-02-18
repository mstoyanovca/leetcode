package top_interview_150.kadane;

public class MaximumSumCircularSubarray {
    // the max subarray sum for a circular array = total sum - minimum sum
    public int maxSubarraySumCircular(int[] nums) {
        int currentMaxSum = nums[0];
        int maxSum = nums[0];
        int currentMinSum = nums[0];
        int minSum = nums[0];
        int totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMaxSum = Math.max(nums[i], currentMaxSum + nums[i]);
            maxSum = Math.max(maxSum, currentMaxSum);

            currentMinSum = Math.min(nums[i], currentMinSum + nums[i]);
            minSum = Math.min(minSum, currentMinSum);

            totalSum += nums[i];
        }

        int circularSum = totalSum - minSum;
        return circularSum == 0 ? maxSum : Math.max(maxSum, circularSum);
    }
}
