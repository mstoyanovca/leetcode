package leetcode150.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), 0, result);
        return result.stream().map(l -> l.stream().sorted().toList()).distinct().toList();
    }

    private void backtrack(int[] candidates, int target, List<Integer> combination, int currentSum, List<List<Integer>> result) {
        // int currentSum = combination.stream().mapToInt(Integer::intValue).sum();
        if (currentSum == target) {
            result.add(new ArrayList<>(combination));
            return;
        } else if (currentSum > target) {
            return;
        }

        for (int candidate : candidates) {
            // if (candidate < combination.getLast()) continue;
            combination.add(candidate);
            backtrack(candidates, target, combination, currentSum += candidate, result);
            int last = combination.getLast();
            currentSum -= last;
            combination.removeLast();
        }
    }
}
