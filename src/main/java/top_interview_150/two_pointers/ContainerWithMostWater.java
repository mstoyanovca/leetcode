package top_interview_150.two_pointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (left < right) {
            int currentWater = (right - left) * Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, currentWater);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
