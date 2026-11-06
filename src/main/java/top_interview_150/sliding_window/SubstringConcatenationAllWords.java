package top_interview_150.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringConcatenationAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        List<Integer> startingIndices = new ArrayList<>();

        for (String word : words) wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);

        // I assume:
        // time complexity O(n * m)
        // space complexity O(n + m)
        for (int left = 0; left < s.length() - words.length * words[0].length() + 1; left++) {
            Map<String, Integer> stringMap = new HashMap<>();

            for (int right = left; right < left + words.length * words[0].length(); right += words[0].length()) {
                String current = s.substring(right, right + words[0].length());
                stringMap.put(current, stringMap.getOrDefault(current, 0) + 1);
            }

            if (stringMap.equals(wordsMap)) startingIndices.add(left);
        }

        return startingIndices;
    }
}
