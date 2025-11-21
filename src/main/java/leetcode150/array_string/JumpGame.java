package leetcode150.array_string;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

        int n = nums.length;
        int left = n - 1;
        int right = n - 1;

        // time complexity O(n)
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
