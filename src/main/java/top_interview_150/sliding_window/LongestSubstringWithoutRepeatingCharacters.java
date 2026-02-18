package top_interview_150.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int result = 0;

        // I assume:
        // time complexity O(m)
        // space complexity O(m)
        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                result = Math.max(result, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return result;
    }
}
