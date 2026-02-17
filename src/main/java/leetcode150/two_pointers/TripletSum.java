package leetcode150.two_pointers;

import java.util.*;

public class TripletSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int left;
        int right;
        Set<List<Integer>> set = new HashSet<>();

        // time complexity O(n * 2)
        // space complexity O(n)
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            left = i + 1;
            right = n - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) set.add(List.of(nums[i], nums[left], nums[right]));
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
