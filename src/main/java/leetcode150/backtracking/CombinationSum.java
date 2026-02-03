package leetcode150.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // required in order for line 26 to work:
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), 0, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, List<Integer> combination, int currentSum, List<List<Integer>> result) {
        if (currentSum == target) {
            result.add(new ArrayList<>(combination));
            return;
        } else if (currentSum > target) {
            return;
        }

        for (int candidate : candidates) {
            // removes duplicates:
            if (!combination.isEmpty() && candidate < combination.getLast()) continue;
            combination.add(candidate);
            backtrack(candidates, target, combination, currentSum += candidate, result);
            int last = combination.getLast();
            currentSum -= last;
            combination.removeLast();
        }
    }
}
