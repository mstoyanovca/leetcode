package leetcode150.array_string;

public class JumpGame1 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

        int n = nums.length;
        int right = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int i = 0; i < n; i++) {
            if (i > right) return false;
            right = Math.max(right, nums[i] + i);
        }

        return true;
    }

    public boolean canJumpBruteForce(int[] nums) {
        if (nums.length == 1) return true;

        int n = nums.length;
        int left = n - 1;
        int right = n - 1;

        // time complexity O(n)
        // space complexity O(1)
        // by some reason this solution times out
        while (right > 0) {
            // move the right pointer left, till it reaches a zero, or the first element:
            while (right > 0 && nums[right] != 0) {
                right--;
            }
            if (right == 0) {
                if (nums[right] != 0) {
                    // reached the first element which is not zero, it's a win:
                    break;
                } else {
                    // reached the first element which is zero, it's a loss:
                    left = 0;
                    break;
                }
            } else {
                left = right;
            }
            // find an element, which jumps over the 0:
            while (left > 0 && left - 1 + nums[left - 1] <= right) {
                left--;
            }
            if (left == 0) {
                // reached the first element, couldn't jump over the zero, it's a loss:
                break;
            } else {
                right = left;
            }
        }

        return left != 0 && right == 0;
    }
}
