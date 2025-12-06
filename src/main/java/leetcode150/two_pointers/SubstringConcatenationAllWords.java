package leetcode150.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringConcatenationAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        int left = 0;
        int right = words[0].length() * words.length;
        List<Integer> result = new ArrayList<>();

        while (right < s.length()) {
            String subString = s.substring(left, right);
            if (Arrays.stream(words).allMatch(subString::contains)) {
                result.add(left);
                left = right;
                right += words[0].length() * words.length;
            } else {
                left++;
                right++;
            }
        }

        return result;
    }
}
