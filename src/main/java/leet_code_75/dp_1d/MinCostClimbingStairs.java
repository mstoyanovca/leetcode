package leet_code_75.dp_1d;

// problem 60:
public class MinCostClimbingStairs {
    // cost.length >= 2
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // stairs are at index 0 to n - 1, the top is at index n:
        int[] dp = createDp(cost, n);

        return Math.min(dp[0], dp[1]);
    }

    private int[] createDp(int[] cost, int n) {
        int[] dp = new int[n + 1];

        for (int i = n; i >= 0; i--) {
            if (i == n) {
                dp[i] = 0;
            } else if (i == n - 1) {
                dp[i] = cost[i];
            } else {
                dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
            }
        }

        return dp;
    }
}
