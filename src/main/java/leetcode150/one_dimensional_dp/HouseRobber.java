package leetcode150.one_dimensional_dp;

public class HouseRobber {
    public int rob(int[] nums) {
        return robUtility(nums, 0);
    }

    // this works, but it times out, because it processes the same 'i' multiple times, memorization is needed:
    private int robUtility(int[] nums, int i) {
        if (i >= nums.length) return 0;
        return Math.max((nums[i] + robUtility(nums, i + 2)), robUtility(nums, i + 1));
    }
}
