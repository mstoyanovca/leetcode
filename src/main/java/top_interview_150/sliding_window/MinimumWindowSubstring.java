package top_interview_150.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int n = s.length();
        int left = 0;
        Map<Character, Integer> tMap = new HashMap<>();
        int remainingChars = t.length();
        String minSubstring = "";

        for (char c : t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);

        // time complexity O(n)
        // space complexity O(m)
        for (int right = 0; right < n; right++) {
            char rightChar = s.charAt(right);
            if (tMap.containsKey(rightChar)) {
                if (tMap.get(rightChar) > 0) remainingChars--;
                tMap.put(rightChar, tMap.get(rightChar) - 1);
            }

            while (remainingChars == 0) {
                if (minSubstring.isEmpty() || right - left + 1 < minSubstring.length()) minSubstring = s.substring(left, right + 1);

                char leftChar = s.charAt(left);
                if (tMap.containsKey(leftChar)) {
                    tMap.put(leftChar, tMap.get(leftChar) + 1);
                    if (tMap.get(leftChar) > 0) remainingChars++;
                }
                left++;
            }
        }

        return minSubstring;
    }
}
