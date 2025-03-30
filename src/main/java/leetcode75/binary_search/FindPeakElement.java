package leetcode75.binary_search;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer < rightPointer) {
            int currentPointer = leftPointer + (rightPointer - leftPointer) / 2;

            if (nums[currentPointer] > nums[currentPointer + 1]) {
                rightPointer = currentPointer;
            } else {
                leftPointer = currentPointer + 1;
            }
        }

        return leftPointer;
    }
}
