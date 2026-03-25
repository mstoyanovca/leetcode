package top_interview_150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    // I assume:
    // time complexity O(n!)
    // space complexity O(n!)
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), permutations);
        return permutations;
    }

    private void backtrack(int[] nums, List<Integer> permutation, List<List<Integer>> permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for (int num : nums) {
            if (permutation.contains(num)) continue;
            permutation.add(num);
            backtrack(nums, permutation, permutations);
            permutation.removeLast();
        }
    }
}
