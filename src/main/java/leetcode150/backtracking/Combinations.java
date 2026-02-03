package leetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int n, int k, int currentInt, List<Integer> currentList, List<List<Integer>> result) {
        if (currentList.size() == k) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = currentInt; i <= n; i++) {
            if (currentList.isEmpty() || i > currentList.getLast()) {
                currentList.add(i);
                backtrack(n, k, currentInt + 1, currentList, result);
                currentList.removeLast();
            }
        }
    }
}
