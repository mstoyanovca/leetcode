package leetcode150.one_dimensional_dp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakUtility(s, wordDict, new HashMap<>());
    }

    public boolean wordBreakUtility(String s, List<String> wordDict, Map<String, Boolean> map) {
        if (s.isEmpty()) return true;
        //if (map.containsKey(s)) return map.get(s);

        for (int left = 0; left < s.length(); left++) {
            String substring = s.substring(0, left + 1);
            if (wordDict.contains(substring)) {
                return wordBreakUtility(s.substring(left + 1), wordDict, map);
            }
        }

        return false;
    }
}
