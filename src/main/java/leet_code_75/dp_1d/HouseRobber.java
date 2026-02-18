package leet_code_75.dp_1d;

// problem 61:
public class HouseRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int[] dp = createDp(nums, n);

        return Math.max(dp[0], dp[1]);
    }

    private int[] createDp(int[] nums, int n) {
        int[] dp = new int[n + 1];

        for (int i = n; i >= 0; i--) {
            if (i == n) {
                dp[i] = 0;
            } else if (i == n - 1) {
                dp[i] = nums[i];
            } else {
                dp[i] = Math.max(dp[i + 1], nums[i] + dp[i + 2]);
            }
        }

        return dp;
    }
}
