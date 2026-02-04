package leetcode150.one_dimensional_dp;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        while (!s.isEmpty()) {
            for (String word : wordDict) {
                if (s.contains(word)) {
                    s = s.replace(word, "");
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
