package leetcode150.binary_search;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if ((middle - 1 < 0 || nums[middle] < nums[middle - 1]) && (middle + 1 > nums.length - 1 || nums[middle] < nums[middle + 1])) {
                return nums[middle];
            } else if (nums[middle] >= nums[left] && nums[middle] > nums[right]) {
                // the left side is ordered, the smaller elements are on the left:
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return 0;
    }
}
