package leetcode150.one_dimensional_dp;

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // time complexity of contains() is O(1) for HashSet and O(n) for List:
        return wordBreakUtility(s, new HashSet<>(wordDict), new HashMap<>(), s.length());
    }

    // this works, but it times out, it needs a map:
    public boolean wordBreakUtility(String s, Set<String> dictionary, Map<Integer, String> memo, int length) {
        if (s.isEmpty()) return true;
        if (memo.containsKey(length - 1)) return true;

        for (int left = 0; left < s.length(); left++) {
            String substring = s.substring(0, left + 1);
            if (dictionary.contains(substring) && wordBreakUtility(s.substring(left + 1), dictionary, memo, length)) {
                memo.put(left, substring);
                return true;
            }
        }

        return memo.containsKey(length - 1);
    }
}
