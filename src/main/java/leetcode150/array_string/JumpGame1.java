package leetcode150.array_string;

public class JumpGame1 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;
        int right = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int i = 0; i < n; i++) {
            if (i > right) return false;
            right = Math.max(right, nums[i] + i);
        }

        return true;
    }
}
