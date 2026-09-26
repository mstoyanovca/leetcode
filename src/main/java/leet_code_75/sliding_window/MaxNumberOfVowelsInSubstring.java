package leet_code_75.sliding_window;

import java.util.Set;

public class MaxNumberOfVowelsInSubstring {
    private final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k - 1;
        int current = 0;
        int result;

        for (int i = left; i <= right; i++) {
            if (isVowel(s.charAt(i))) {
                current++;
            }
        }
        result = current;

        while (right < s.length() - 1) {
            if (isVowel(s.charAt(left))) {
                current--;
            }
            left++;

            if (isVowel(s.charAt(right + 1))) {
                current++;
            }
            right++;

            result = Math.max(result, current);
        }

        return result;
    }

    private boolean isVowel(char c) {
        return vowels.contains(c);
    }
}
