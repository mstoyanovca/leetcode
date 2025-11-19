package leetcode150.array_string;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if (l == 1 || l == k) return;

        // time complexity O(k*k)
        // space complexity O(1)
        for (int i = 0; i < k; i++) {
            int acc = nums[l - 1];
            shiftRight(nums);
            nums[0] = acc;
        }
    }

    private void shiftRight(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
    }
}
