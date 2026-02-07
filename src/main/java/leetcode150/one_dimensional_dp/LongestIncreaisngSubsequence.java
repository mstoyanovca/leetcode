package leetcode150.one_dimensional_dp;

public class LongestIncreaisngSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] subsequence = new int[nums.length];
        int size = 0;

        for (int num : nums) {
            int left = 0;
            int right = size;

            while (left != right) {
                int middle = (left + right) / 2;
                if (subsequence[middle] < num) left = middle + 1;
                else right = middle;
            }

            subsequence[left] = num;
            if (left == size) ++size;
        }

        return size;
    }

    public int lengthOfLISUtility2(int[] nums) {
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
