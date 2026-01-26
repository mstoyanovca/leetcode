package leetcode150.binary_search;

public class FirstLastPositionInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;

        // find the first occurrence:
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target == nums[middle]) {
                result[0] = middle;
                right = middle - 1;
            } else if (target >= nums[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        // find the last occurrence:
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target == nums[middle]) {
                result[1] = middle;
                left = middle + 1;
            } else if (target >= nums[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return result;
    }
}
