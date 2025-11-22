package leetcode150.array_string;

public class JumpGame2 {
    public int jump(int[] nums) {
        return 0;
    }

    public int jump2(int[] nums) {
        if (nums.length == 1) return 0;

        int n = nums.length;
        int jumps = 0;
        int maxRight = nums[0];

        for (int i = 0; i < n; i++) {
            if (nums[i] + i >= maxRight) {
                jumps++;
                maxRight = nums[i] + i;
            }
            if (i + maxRight >= n - 1) {
                jumps++;
                break;
            }
        }

        return jumps;
    }

    public int jump3(int[] nums) {
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
