package leetcode150.two_pointers;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int left;
        int right;
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            left = i + 1;
            right = n - 1;
            while (right > left) {
                while (right > left && nums[i] + nums[left] + nums[right] != 0) {
                    right--;
                }
                if (right > left && nums[i] + nums[left] + nums[right] == 0) {
                    set.add(List.of(nums[i], nums[left], nums[right]));
                    right--;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
