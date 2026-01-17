package leetcode150.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberLetterCombinations {
    private final Map<Character, List<String>> digitToLetters = createDigitToLetters();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        dfs(0, digits, new StringBuilder(), result);
        return result;
    }

    // DFS with backtracking solution, it could be done with BFS with a queue too;
    private void dfs(int i, String digits, StringBuilder builder, List<String> result) {
        if (i == digits.length()) {
            result.add(builder.toString());
            return;
        }

        char digit = digits.charAt(i);
        // for i = 0 abc, for i = 1 def; it's a nested loop def for each abc;
        // a-d, deletes d, a-e, deletes e, a-f, deletes f, deletes a;
        // starts over with b-d, b-e, b-f , deletes b, c-d, c-e, c-f, deletes c, etc.
        List<String> letters = digitToLetters.get(digit);  // for i = 0 abc, for i = 1 def
        for (String letter : letters) {
            builder.append(letter);
            dfs(i + 1, digits, builder, result);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    private Map<Character, List<String>> createDigitToLetters() {
        Map<Character, List<String>> map = new HashMap<>();

        map.put('2', List.of("a", "b", "c"));
        map.put('3', List.of("d", "e", "f"));
        map.put('4', List.of("g", "h", "i"));
        map.put('5', List.of("j", "k", "l"));
        map.put('6', List.of("m", "n", "o"));
        map.put('7', List.of("p", "q", "r", "s"));
        map.put('8', List.of("t", "u", "v"));
        map.put('9', List.of("w", "x", "y", "z"));

        return map;
    }
}
