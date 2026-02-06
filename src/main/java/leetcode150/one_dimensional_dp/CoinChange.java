package leetcode150.one_dimensional_dp;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        return coinChangeUtility(coins, amount);
    }

    // recursion (top-down approach)
    // time complexity O(n ^ amount)
    // space complexity O(amount)
    public int coinChangeUtility(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        int minCoins = -1;

        for (int coin : coins) {
            int result = coinChangeUtility(coins, amount - coin);
            if (result >= 0) minCoins = minCoins == -1 ? 1 + result : Math.min(minCoins, 1 + result);
        }

        return minCoins;
    }

    // a classic bottom-up DP problem
    // time complexity O(amount * n)
    // space complexity O(amount)
    public int coinChangeBottomUp(int[] coins, int amount) {
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
}
