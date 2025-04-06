package leetcode75.dp_md;

// problem 63:
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        // m - rows, n - columns;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    dp[0][j] = 1;
                } else if (i == 1) {
                    dp[1][j] = j + 1;
                } else {
                    if (j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
