package top_interview_150.dp_1d;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {
    public int rob(int[] nums) {
        return robUtilityRecursive(0, nums);
    }

    // time complexity O(n)
    // space complexity O(n)
    private int robUtilityWithMemoization(int i, int[] nums, Map<Integer, Integer> memo) {
        if (i >= nums.length) return 0;
        if (!memo.containsKey(i)) memo.put(i, Math.max((nums[i] + robUtilityWithMemoization(i + 2, nums, memo)), robUtilityWithMemoization(i + 1, nums, memo)));
        return memo.get(i);
    }

    // this works, but it times out, because it processes the same 'i' multiple times, memoization is needed:
    private int robUtilityRecursive(int i, int[] nums) {
        if (i >= nums.length) return 0;
        return Math.max((nums[i] + robUtilityRecursive(i + 2, nums)), robUtilityRecursive(i + 1, nums));
    }
}
