package leetcode150.two_pointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringConcatenationAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        if (words.length * words[0].length() > s.length()) return List.of();

        int left = 0;
        int right = words[0].length() * words.length - 1;
        Map<String, Integer> wordsMap = new HashMap<>();
        Map<String, Integer> windowMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (String word : words) {
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 1);
            } else {
                wordsMap.put(word, wordsMap.get(word) + 1);
            }
        }

        while (!wordsMap.containsKey(s.substring(left, left + words[0].length()))) {
            left++;
            right++;
        }
        for (int i = left; i < right + 1; i += words[0].length()) {
            String word = s.substring(i, i + words[0].length());
            if (!windowMap.containsKey(word)) {
                windowMap.put(word, 1);
            } else {
                windowMap.put(word, windowMap.get(word) + 1);
            }
        }

        // I assume:
        // time complexity O(m + n)
        // space complexity O(m)
        while (right < s.length()) {
            if (wordsMap.equals(windowMap)) result.add(left);

            // remove the first word in the window:
            String word = s.substring(left, left + words[0].length());
            if (windowMap.get(word) != null && windowMap.get(word) > 1) {
                windowMap.put(word, windowMap.get(word) - 1);
            } else {
                windowMap.remove(word);
            }

            // shift right:
            if (left + 1 < s.length() && wordsMap.containsKey(s.substring(left + 1, left + words[0].length() + 1))) {
                left++;
                right++;
            } else {
                left += words[0].length();
                right += words[0].length();
            }
            if (right > s.length() - 1) break;

            // add the new word in the window:
            word = s.substring(right - words[0].length() + 1, right + 1);
            if (!windowMap.containsKey(word)) {
                windowMap.put(word, 1);
            } else {
                windowMap.put(word, windowMap.get(word) + 1);
            }
        }

        return result;
    }
}
