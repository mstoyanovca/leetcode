package leetcode150.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int left = 0;
        int remainingChars = t.length();
        int[] minIndexes = new int[2];
        minIndexes[1] = Integer.MAX_VALUE;

        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);

        // time complexity O(n)
        // space complexity O(m)
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if (tMap.containsKey(rightChar)) {
                if (tMap.get(rightChar) > 0) remainingChars--;
                tMap.put(rightChar, tMap.get(rightChar) - 1);
            }

            while (remainingChars == 0) {
                if (right - left < minIndexes[1] - minIndexes[0]) {
                    minIndexes[0] = left;
                    minIndexes[1] = right;
                }
                char leftChar = s.charAt(left);
                if (tMap.containsKey(leftChar)) {
                    tMap.put(leftChar, tMap.get(leftChar) + 1);
                    if (tMap.get(leftChar) > 0) remainingChars++;
                }
                left++;
            }
        }

        // the second argument in substring is exclusive:
        return minIndexes[1] < Integer.MAX_VALUE ? s.substring(minIndexes[0], minIndexes[1] + 1) : "";
    }
}
