package leet_code_75.dp_1d;

// problem 62:
public class DominoTrominoTiling {
    public int numTilings(int n) {
        if (n <= 2) return n;
        if (n == 3) return 5;
        long[] dp = new long[n + 1];
        dp[0] = 1;  // 1 way of returning 0
        dp[1] = 1;  // 1 way of returning |
        dp[2] = 2;  // return || or =
        dp[3] = 5;

        for (int i = 4; i <= n; i++) {
            dp[i] = 2 * dp[i - 1] + dp[i - 3];
            dp[i] %= 1_000_000_007;
        }

        return (int) dp[n];
    }
}
