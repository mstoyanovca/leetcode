package top_interview_150.array_string;

public class JumpGame1 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int right = nums[0];

        // time complexity O(n)
        // space complexity O(1)
        for (int i = 0; i < n; i++) {
            if (i > right) return false;
            right = Math.max(right, i + nums[i]);
        }

        return true;
    }
}
