package top_interview_150.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringConcatenationAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        if (words.length * words[0].length() > s.length()) return List.of();

        List<Integer> result = new ArrayList<>();

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);

        // I assume:
        // time complexity O(words[0].length() * s.length())
        // space complexity O(words.length + s.length())
        for (int offset = 0; offset < words[0].length(); offset++) {
            int left = offset;
            int right = left + words[0].length() * words.length - 1;
            if (right > s.length() - 1) break;

            Map<String, Integer> windowMap = new HashMap<>();
            for (int i = left; i < right + 1; i += words[0].length()) {
                String word = s.substring(i, i + words[0].length());
                windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
            }

            while (true) {
                if (wordsMap.equals(windowMap)) result.add(left);

                // remove the first word in the window:
                String word = s.substring(left, left + words[0].length());
                if (windowMap.get(word) > 1) {
                    windowMap.put(word, windowMap.get(word) - 1);
                } else {
                    windowMap.remove(word);
                }

                // shift right:
                left += words[0].length();
                right += words[0].length();
                if (right > s.length() - 1) break;

                // add the new word in the window:
                word = s.substring(right - words[0].length() + 1, right + 1);
                windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
            }
        }

        return result;
    }
}
