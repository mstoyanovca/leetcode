package leetcode150.one_dimensional_dp;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {
    public int rob(int[] nums) {
        return robUtility(nums, 0, new HashMap<>());
    }

    // time complexity O(n)
    // space complexity O(n)
    private int robUtility(int[] nums, int i, Map<Integer, Integer> map) {
        if (i >= nums.length) return 0;
        if (!map.containsKey(i)) map.put(i, Math.max((nums[i] + robUtility(nums, i + 2, map)), robUtility(nums, i + 1, map)));
        return map.get(i);
    }

    // this works, but it times out, because it processes the same 'i' multiple times, memorization is needed:
    private int robUtility2(int[] nums, int i) {
        if (i >= nums.length) return 0;
        return Math.max((nums[i] + robUtility2(nums, i + 2)), robUtility2(nums, i + 1));
    }
}
