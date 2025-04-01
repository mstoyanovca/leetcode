package leetcode75.backtracking;

import java.util.*;

// problem 57;
public class PhoneNumberCombinations {
    private final Map<Character, List<String>> digitToLetters = createDigitToLetters();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        dfs(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void dfs(String digits, int i, StringBuilder builder, List<String> result) {
        if (i == digits.length()) {
            result.add(builder.toString());
            return;
        }

        char digit = digits.charAt(i);
        List<String> letters = digitToLetters.get(digit);
        for (String letter : letters) {
            builder.append(letter);
            dfs(digits, i + 1, builder, result);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    private Map<Character, List<String>> createDigitToLetters() {
        Map<Character, List<String>> map = new HashMap<>();
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
        return map;
    }
}
