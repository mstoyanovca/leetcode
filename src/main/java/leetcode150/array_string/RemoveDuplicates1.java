package leetcode150.array_string;

public class RemoveDuplicates1 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        // number of unique elements:
        int k = 1;
        int left = 0;
        int right = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (right < nums.length) {
            if (nums[right] == nums[left]) {
                right++;
            } else if (nums[right] > nums[left]) {
                left = right;
                nums[k] = nums[right];
                k++;
            }
        }

        return k;
    }
}
