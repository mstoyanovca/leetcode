package leetcode150.array_string;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2 + 1;
        int left = 0;
        int right = 0;
        int result = 0;

        Arrays.sort(nums);

        // time complexity O(n * log(n))
        // space complexity O(1)
        while (right < n) {
            while (right < n && nums[right] == nums[left]) right++;

            if (right - left >= majority) {
                result = nums[left];
                break;
            } else {
                left = right;
            }
        }

        return result;
    }
}
