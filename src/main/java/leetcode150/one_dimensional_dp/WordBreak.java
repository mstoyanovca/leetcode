package leetcode150.one_dimensional_dp;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n];
        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                String ss = s.substring(left, right + 1);
                if (wordDict.contains(ss))
                    dp[right] = true;
            }
        }

        return dp[n - 1];
    }

    public boolean wordBreak2(String s, List<String> wordDict) {
        for (String word : wordDict) if (s.contains(word)) s = s.replace(word, "");
        return s.isEmpty();
    }
}
