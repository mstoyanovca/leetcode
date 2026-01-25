package leetcode150.binary_search;

public class PeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;
            int previous = nums[Math.max(0, middle - 1)];
            int next = nums[Math.min(nums.length - 1, middle + 1)];

            if (nums[middle] > previous && nums[middle] > next) {
                return middle;
            } else if (nums[middle] > previous) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return left;
    }
}
