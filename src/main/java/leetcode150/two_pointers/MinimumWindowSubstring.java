package leetcode150.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int[] minIndexes = new int[2];
        minIndexes[1] = Integer.MAX_VALUE;

        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);

        // time complexity O(?)
        // space complexity O(?)
        while (right < s.length()) {
            char c = s.charAt(right);
            if (tMap.containsKey(c)) {
                if (tMap.containsKey(c) & tMap.get(c) > 1) {
                    tMap.put(c, tMap.get(c) - 1);
                } else {
                    tMap.remove(c);
                }
            }
            if (!tMap.isEmpty()) {
                right++;
            } else {
                if (right - left < minIndexes[1] - minIndexes[0]) {
                    minIndexes[0] = left;
                    minIndexes[1] = right;
                }
                for (char ch : t.toCharArray()) tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
                left++;
                right = left;
            }
        }

        return minIndexes[1] < Integer.MAX_VALUE ? s.substring(minIndexes[0], minIndexes[1] + 1) : "";
    }
}
