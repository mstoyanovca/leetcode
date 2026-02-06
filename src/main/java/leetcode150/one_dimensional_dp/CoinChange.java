package leetcode150.one_dimensional_dp;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        Arrays.sort(coins);
        // int[] sorted = IntStream.of(coins).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
        return coinChangeUtility(coins, coins.length - 1, amount, -1);
    }

    private int coinChangeUtility(int[] coins, int index, int amount, int result) {
        if (amount == 0) return result;
        if (index < 0) return -1;

        while (amount >= coins[index]) {
            amount -= coins[index];
            result = result == -1 ? 1 : result + 1;
        }

        return coinChangeUtility(coins, --index, amount, result);
    }
}
