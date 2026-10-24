package top_interview_150.array_string;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2 + 1;
        int left = 0;
        int counter = 0;

        Arrays.sort(nums);

        // time complexity O(n * log(n))
        // space complexity O(1)
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[left]) {
                counter++;
            } else {
                left = i;
                counter = 1;
            }
            if (counter >= majority) {
                return nums[i];
            }
        }

        return -1;
    }
}
