package leet_code_75.backtracking;

import java.util.ArrayList;
import java.util.List;

// problem 58:
public class CombinationSum {
    // 2 <= k <= 9
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> combinations = new ArrayList<>();
        dfs(k, n, new ArrayList<>(), combinations, 1);
        return combinations;
    }

    private void dfs(int k, int n, List<Integer> entry, List<List<Integer>> combinations, int start) {
        if (entry.size() == k) {
            if (n == 0) combinations.add(new ArrayList<>(entry));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (!entry.isEmpty() && i <= entry.get(entry.size() - 1)) continue;
            entry.add(i);
            dfs(k, n - i, entry, combinations, start + 1);
            entry.remove(entry.size() - 1);
        }
    }
}
