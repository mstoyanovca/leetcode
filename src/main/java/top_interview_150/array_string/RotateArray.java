package top_interview_150.array_string;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1 || n == k) return;
        // if k > n, rotating every n times brings the same state, normalize:
        k %= n;

        // time complexity O(n)
        // space complexity O(1)
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int acc = nums[left];
            nums[left] = nums[right];
            nums[right] = acc;
            left++;
            right--;
        }
    }

    public void rotateBruteForce(int[] nums, int k) {
        if (nums.length == 1 || nums.length == k) return;

        // time complexity O(k * n)
        // space complexity O(1)
        rotateRight(nums, k);
    }

    private void rotateRight(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int acc = nums[nums.length - 1];
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
