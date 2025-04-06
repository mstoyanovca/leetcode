package leetcode75.dp_md;

import java.util.Arrays;
import java.util.Collections;

// problem 66:
public class EditDistance {
    public int minDistance(String word1, String word2) {
        // m = rows, n = columns;
        final int m = word1.length();
        final int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) dp[i][0] = i;
        for (int j = 0; j < n + 1; j++) dp[0][j] = j;

        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else {
                    int x = dp[i - 1][j - 1];
                    int y = dp[i - 1][j];
                    int z = dp[i][j - 1];
                    dp[i][j] = Collections.min(Arrays.asList(dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1])) + 1;
                    // dp[i][j] = Stream.of(dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1]).mapToInt(v -> v).min().orElse(-1);
                    // dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }

        return dp[m][n];
    }
}
