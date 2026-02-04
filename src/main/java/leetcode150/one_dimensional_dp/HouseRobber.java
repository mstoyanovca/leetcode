package leetcode150.one_dimensional_dp;

public class HouseRobber {
    public int rob(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                max1 += nums[i];
            } else {
                max2 += nums[i];
            }

        }

        return Math.max(max1, max2);
    }
}
