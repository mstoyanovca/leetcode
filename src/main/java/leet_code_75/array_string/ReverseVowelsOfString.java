package leet_code_75.array_string;

import java.util.Set;

public class ReverseVowelsOfString {
    private final Set<Character> vowels = Set.of('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');

    public String reverseVowels(String s) {
        StringBuilder builder = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!vowels.contains(s.charAt(left))) {
                left++;
            } else if (!vowels.contains(s.charAt(right))) {
                right--;
            } else {
                if (s.charAt(left) != s.charAt(right)) {
                    builder.setCharAt(left, s.charAt(right));
                    builder.setCharAt(right, s.charAt(left));
                }
                left++;
                right--;
            }
        }

        return builder.toString();
    }
}
