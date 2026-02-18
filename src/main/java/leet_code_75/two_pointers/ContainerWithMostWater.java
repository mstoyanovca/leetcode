package leet_code_75.two_pointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while (leftPointer < height.length && rightPointer > 0 && rightPointer > leftPointer) {
            int currentArea = calculateCurrentArea(height, leftPointer, rightPointer);
            if (maxArea < currentArea) maxArea = currentArea;
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxArea;
    }

    private int calculateCurrentArea(int[] height, int leftPointer, int rightPointer) {
        return Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer);
    }
}
