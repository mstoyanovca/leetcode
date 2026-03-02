package top_interview_150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), combinations);
        return combinations;
    }

    private void backtrack(int n, int k, int current, List<Integer> combination, List<List<Integer>> combinations) {
        if (combination.size() == k) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        for (int i = current; i <= n; i++) {
            if (combination.isEmpty() || i > combination.getLast()) {
                combination.add(i);
                backtrack(n, k, current + 1, combination, combinations);
                combination.removeLast();
            }
        }
    }
}
