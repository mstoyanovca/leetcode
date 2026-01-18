package leetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), result);
        return result.stream().map(l -> l.stream().sorted().toList()).distinct().toList();
    }

    private void backtrack(int[] candidates, int target, List<Integer> combination, List<List<Integer>> result) {
        int currentSum = combination.stream().mapToInt(Integer::intValue).sum();
        if (currentSum == target) {
            result.add(new ArrayList<>(combination));
            return;
        } else if (currentSum > target) {
            return;
        }

        for (int candidate : candidates) {
            combination.add(candidate);
            backtrack(candidates, target, combination, result);
            combination.removeLast();
        }
    }
}
