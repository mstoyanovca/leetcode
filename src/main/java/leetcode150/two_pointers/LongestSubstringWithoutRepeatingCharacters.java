package leetcode150.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;

        // I assume:
        // time complexity O(n)
        // space complexity O(n)
        while (right < s.length()) {
            if (!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), 1);
                result = Math.max(result, map.size());
                right++;
            } else {
                map.remove(s.charAt(left));
                left++;
            }
        }

        return result;
    }
}
