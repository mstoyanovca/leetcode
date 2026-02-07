package leetcode150.one_dimensional_dp;

public class LongestIncreaisngSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;

        return lengthOfLISUtility(nums);
    }

    public int lengthOfLISUtility(int[] nums) {
        int maxResult = 0;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int result = 1;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] > current) {
                    current = nums[j];
                    result++;
                }
            }
            maxResult = Math.max(maxResult, result);
        }

        return maxResult;
    }
}
