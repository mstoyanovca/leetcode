package leetcode150.array_string;

public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = 0;
        int volume = 0;

        while (right < n) {
            // find a left wall:
            while (left < n - 1 && height[left + 1] > height[left]) {
                left++;
            }
            right = left;
            // find a right wall:
            while (right < n - 1 && height[right + 1] < height[left]) {
                right++;
            }
            right++;
            // calculate the volume between them:
            int level = Math.min(height[left], height[right]);
            for (int i = left + 1; i < right; i++) {
                volume += level - height[i];
            }
            left = right;
        }

        return 0;
    }
}
