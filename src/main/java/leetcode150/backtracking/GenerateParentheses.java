package leetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, 0, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int n, int opening, int closing, StringBuilder current, List<String> result) {
        if (opening == closing && opening + closing == 2 * n) {
            result.add(current.toString());
            return;
        }

        if (opening < n) {
            backtrack(n, ++opening, closing, current.append("("), result);
            //current.deleteCharAt(current.length() - 1);
        } else if (closing < opening) {
            backtrack(n, opening, ++closing, current.append(")"), result);
            //current.deleteCharAt(current.length() - 1);
        }
    }
}
