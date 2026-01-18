package leetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int currentIndex, List<Integer> permutation, List<List<Integer>> result) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = currentIndex; i < nums.length; i++) {
            if (permutation.contains(nums[i])) continue;
            permutation.add(nums[i]);
            backtrack(nums, currentIndex, permutation, result);
            permutation.removeLast();
        }
    }
}
