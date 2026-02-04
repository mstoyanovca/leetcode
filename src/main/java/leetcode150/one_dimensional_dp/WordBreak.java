package leetcode150.one_dimensional_dp;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakUtility(s, wordDict);
    }

    public boolean wordBreakUtility(String s, List<String> wordDict) {
        if (s.isEmpty()) return true;

        for (int left = 0; left < s.length(); left++) {
            if (wordDict.contains(s.substring(0, left + 1)) && wordBreakUtility(s.substring(left + 1), wordDict)) {
                return true;
            }
        }

        return false;
    }
}
