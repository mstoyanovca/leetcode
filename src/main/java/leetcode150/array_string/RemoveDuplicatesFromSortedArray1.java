package leetcode150.array_string;

public class RemoveDuplicatesFromSortedArray1 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) return n;
        int left = 0;
        int right = 1;
        int k = 1;

        // time complexity O(n)
        // space complexity O(1)
        while (right <= n - 1) {
            if (nums[right] == nums[left]) {
                right++;
            } else if (nums[right] > nums[left]) {
                left++;
                nums[left] = nums[right];
                right++;
                k++;
            }
        }

        return k;
    }
}
