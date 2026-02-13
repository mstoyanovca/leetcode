package leetcode150.array_string;

public class RemoveDuplicatesFromSortedArray2 {
    // I need 3 pointers: left, right and k
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int k = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (right < n) {
            while (right < n && nums[right] == nums[left]) right++;

            if (right - left == 1) {
                nums[k] = nums[left];
                k++;
            } else if (right - left >= 2) {
                nums[k] = nums[left];
                nums[k + 1] = nums[left];
                k += 2;
            }
            left = right;
        }

        return k;
    }
}
