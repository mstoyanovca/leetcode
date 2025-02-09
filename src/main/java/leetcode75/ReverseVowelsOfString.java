package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfString {
    private final char[] allVowels = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};

    public String reverseVowels(String s) {
        char[] input = s.toCharArray();

        List<Character> vowelsInInput = new ArrayList<>();
        int[] vowelsMap = new int[s.length()];
        for (int i = 0; i < input.length; i++) {
            if (isVowel(input[i])) {
                vowelsInInput.add(input[i]);
                vowelsMap[i] = 1;
            } else {
                vowelsMap[i] = 0;
            }
        }

        int index = vowelsInInput.size() - 1;
        for (int i = 0; i < input.length; i++) {
            if (vowelsMap[i] == 1) {
                input[i] = vowelsInInput.get(index);
                index--;
            }
        }

        return String.valueOf(input);
    }

    private boolean isVowel(char c) {
        for (char vowel : allVowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}
