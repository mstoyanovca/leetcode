package leetcode150.two_pointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringConcatenationAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        int left = 0;
        int right = words[0].length() * words.length - 1;
        List<Integer> result = new ArrayList<>();
        if (words.length > s.length()) return result;

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 1);
            } else {
                wordsMap.put(word, wordsMap.get(word) + 1);
            }
        }

        Map<String, Integer> windowMap = new HashMap<>();
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
        // space complexity O(m + n)
        while (right < s.length()) {
            if (wordsMap.equals(windowMap)) result.add(left);
            String word = s.substring(left, left + words[0].length());
            if (windowMap.get(word) != null && windowMap.get(word) > 1) {
                windowMap.put(word, windowMap.get(word) - 1);
            } else {
                windowMap.remove(word);
            }
            left += words[0].length();
            right += words[0].length();
            if (right > s.length() - 1) break;
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
