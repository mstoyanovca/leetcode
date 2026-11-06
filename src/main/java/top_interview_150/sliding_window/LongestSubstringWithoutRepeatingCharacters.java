package top_interview_150.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int maxLength = 0;

        // I assume:
        // time complexity O(n)
        // space complexity O(m)
        while (right < n) {
            char c = s.charAt(right);

            if (!set.contains(c)) {
                maxLength = Math.max(maxLength, right - left + 1);
                set.add(c);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
