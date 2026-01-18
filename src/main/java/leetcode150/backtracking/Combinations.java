package leetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        for (int left = 1; left <= n - k + 1; left++) {
            List<Integer> current = new ArrayList<>();
            for (int i = left; i < left + k; i++) {
                current.add(i);
            }
            result.add(current);
        }

        return result;
    }
}
