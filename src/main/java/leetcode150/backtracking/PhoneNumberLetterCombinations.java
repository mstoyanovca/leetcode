package leetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneNumberLetterCombinations {
    private final Map<Character, String> digitToLetters = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");

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
        String letters = digitToLetters.get(digit);  // for i = 0 abc, for i = 1 def
        for (char letter : letters.toCharArray()) {
            builder.append(letter);
            dfs(i + 1, digits, builder, result);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
