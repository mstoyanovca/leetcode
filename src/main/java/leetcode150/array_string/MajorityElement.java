package leetcode150.array_string;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums.length / 2 + 1;
        int left = 0;
        int right = 0;
        int result = 0;

        Arrays.sort(nums);

        // time complexity O(n*log(n))
        // space complexity O(1)
        while (right < nums.length) {
            while (right + 1 < nums.length  && nums[left] == nums[right + 1]) {
                right++;
            }
            if (right - left >= majority - 1) {
                result = nums[right];
                break;
            }
            right++;
            left = right;
        }

        return result;
    }
}
