package top_interview_150.dp_1d;

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // time complexity of contains() is O(1) for HashSet and O(n) for List:
        return wordBreakMemo(s, new HashSet<>(wordDict), new HashMap<>());
    }

    private boolean wordBreakMemo(String s, Set<String> dictionary, Map<String, Boolean> memo) {
        if (memo.containsKey(s)) return memo.get(s);
        if (s.isEmpty()) return true;

        for (String word : dictionary) {
            if (s.startsWith(word)) {
                if (wordBreakMemo(s.substring(word.length()), dictionary, memo)) {
                    memo.put(word, true);
                    return true;
                }
            }
        }

        memo.put(s, false);
        return false;
    }
}
