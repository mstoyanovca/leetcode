package top_interview_150.two_pointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int level = Math.min(height[left], height[right]);
        int maxAmount = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (left < right) {
            maxAmount = Math.max(maxAmount, (right - left) * level);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            level = Math.min(height[left], height[right]);
        }

        return maxAmount;
    }
}
