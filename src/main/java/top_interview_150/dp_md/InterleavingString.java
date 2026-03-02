package top_interview_150.dp_md;

public class InterleavingString {
    private Boolean[][] dp;

    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        if (m + n != s3.length()) return false;

        dp = new Boolean[m + 1][n + 1];

        return isInterleaveUtility(0, 0, s1, s2, s3);
    }

    // recursive with memoization approach
    // time complexity  O(m * n)
    // space complexity O(m * n)
    private boolean isInterleaveUtility(int i, int j, String s1, String s2, String s3) {
        if (i == s1.length() && j == s2.length()) return true;
        if (dp[i][j] != null) return dp[i][j];

        if (i < s1.length() && s1.charAt(i) == s3.charAt(i + j)) {
            if (isInterleaveUtility(i + 1, j, s1, s2, s3)) return dp[i][j] = true;
        }

        if (j < s2.length() && s2.charAt(j) == s3.charAt(i + j)) {
            if (isInterleaveUtility(i, j + 1, s1, s2, s3)) return dp[i][j] = true;
        }

        return dp[i][j] = false;
    }

    // 2D DP approach
    // time complexity  O(m * n)
    // space complexity O(m * n)
    public boolean isInterleave2dDp(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        if (m + n != s3.length()) return false;

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 1; i <= m; i++) dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        for (int j = 1; j <= n; j++) dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }

        return dp[m][n];
    }

    // 1D DP approach
    // time complexity  O(m * n)
    // space complexity O(min(m, n))
    public boolean isInterleave1dDp(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        if (m + n != s3.length()) return false;

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] && s2.charAt(i - 1) == s3.charAt(i - 1);
        }

        for (int i = 1; i <= m; i++) {
            dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                dp[j] = (dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }

        return dp[n];
    }
}
