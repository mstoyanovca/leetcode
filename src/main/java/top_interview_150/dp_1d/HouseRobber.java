package top_interview_150.dp_1d;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {
    public int rob(int[] nums) {
        return robMemo(0, nums, new HashMap<>());
    }

    // time complexity O(n)
    // space complexity O(n)
    private int robMemo(int i, int[] nums, Map<Integer, Integer> memo) {
        if (i >= nums.length) return 0;
        if (!memo.containsKey(i)) memo.put(i, Math.max((nums[i] + robMemo(i + 2, nums, memo)), robMemo(i + 1, nums, memo)));
        return memo.get(i);
    }

    // this works, but it times out, because it processes the same 'i' multiple times, memoization is needed:
    private int robUtilityRecursive(int i, int[] nums) {
        if (i >= nums.length) return 0;
        return Math.max((nums[i] + robUtilityRecursive(i + 2, nums)), robUtilityRecursive(i + 1, nums));
    }
}
