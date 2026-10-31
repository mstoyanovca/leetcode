package top_interview_150.two_pointers;

import java.util.*;

public class TripletSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        // time complexity O(n * 2)
        // space complexity O(n)
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    set.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
