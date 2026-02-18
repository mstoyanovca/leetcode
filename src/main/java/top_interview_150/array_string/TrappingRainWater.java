package top_interview_150.array_string;

public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int leftWall = height[left];
        int right = n - 1;
        int rightWall = height[right];
        int level = Math.min(leftWall, rightWall);
        int volume = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (left < right) {
            if (height[left] < height[right]) {
                volume += level - height[left];
                left++;
                leftWall = Math.max(leftWall, height[left]);
            } else {
                volume += level - height[right];
                right--;
                rightWall = Math.max(rightWall, height[right]);
            }

            level = Math.min(leftWall, rightWall);
        }

        return volume;
    }
}
