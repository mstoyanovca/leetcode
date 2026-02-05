package leetcode150.one_dimensional_dp;

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // time complexity of contains() is O(1) for HashSet and O(n) for List:
        return wordBreakUtility(s, new HashSet<>(wordDict), new HashMap<>());
    }

    // this works, but it times out, it needs a map:
    public boolean wordBreakUtility(String s, Set<String> dictionary, Map<String, Boolean> map) {
        if (map.containsKey(s)) return map.get(s);
        if (s.isEmpty()) return true;

        for (String word : dictionary) {
            if (s.startsWith(word)) {
                if (wordBreakUtility(s.substring(word.length()), dictionary, map)) {
                    map.put(word, true);
                    return true;
                }
            }
        }

        map.put(s, false);
        return false;
    }
}
