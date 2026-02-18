package top_interview_150.array_string;

public class JumpGame2 {
    public int jump(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int jumps = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int i = 0; i < n - 1; i++) {
            right = Math.max(right, i + nums[i]);
            if (left == i) {
                jumps++;
                left = right;
            }
        }

        return jumps;
    }
}
