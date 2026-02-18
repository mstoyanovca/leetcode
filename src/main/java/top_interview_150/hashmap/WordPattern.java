package top_interview_150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] chars = pattern.toCharArray();
        String[] words = s.split(" ");
        if (chars.length != words.length) return false;
        Map<Character, String> charToWord = new HashMap<>();

        // time complexity O(n)
        // space complexity O(n)
        for (int i = 0; i < pattern.length(); i++) {
            char c = chars[i];
            String word = words[i];

            if (!charToWord.containsKey(c)) {
                if (charToWord.containsValue(word)) return false;
                charToWord.put(c, word);
            } else {
                if (!charToWord.get(c).equals(word)) return false;
            }
        }

        return true;
    }
}
