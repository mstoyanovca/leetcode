package leetcode150.array_string;

public class JumpGame2 {
    public int jump(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int maxRight = 0;
        int maxRightIndex = 0;
        int jumps = 0;

        while (right < n) {
            for (right = left; right <= nums[left] + left; right++) {
                if (maxRight <= nums[right]) {
                    maxRight = nums[right];
                    maxRightIndex = right;
                    /*if (maxRight + right >= n - 1) {
                        jumps++;
                        break;
                    }*/
                }
            }
            if (maxRightIndex > left) {
                jumps++;
                left = maxRightIndex;
                right = maxRightIndex;
                maxRight = 0;
                int x = 0;
            }
        }

        return jumps;
    }
}
