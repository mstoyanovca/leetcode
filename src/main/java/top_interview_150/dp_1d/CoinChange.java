package top_interview_150.dp_1d;

import java.util.Arrays;

public class CoinChange {
    // bottom-up DP approach
    // time complexity O(n * amount)
    // space complexity O(amount)
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    // recursion (top-down approach)
    // time complexity O(n ^ amount)
    // space complexity O(amount)
    // it times out in the LeetCode engine
    public int coinChangeRecursion(int[] coins, int amount) {
        if (amount == 0) return 0;
        else if (amount < 0) return -1;
        int minCoins = -1;

        for (int coin : coins) {
            int coinsRemaining = coinChangeRecursion(coins, amount - coin);
            if (coinsRemaining >= 0) minCoins = minCoins == -1 ? 1 + coinsRemaining : Math.min(minCoins, 1 + coinsRemaining);
        }

        return minCoins;
    }
}
