package top_interview_150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, 0, 0, "", result);
        return result;
    }

    private void backtrack(int n, int opening, int closing, String current, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (opening < n) backtrack(n, opening + 1, closing, current + "(", result);
        if (closing < opening) backtrack(n, opening, closing + 1, current + ")", result);
    }
}
