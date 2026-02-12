package leetcode150.array_string;

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int k = 0;
        int left = 0;
        int right = 0;
        int writeLeft = 0;
        int writeRight;

        // time complexity O(n)
        // space complexity O(1)
        while (right < nums.length) {
            while (right < nums.length - 1 && nums[left] == nums[right + 1]) {
                right++;
            }
            // all elements are the same:
            if (right == nums.length - 1 && nums[right] == nums[0]) {
                k = 2;
                break;
            }
            if (right - left > 0) {
                k += 2;
                writeRight = writeLeft + 2;
            } else {
                k += 1;
                writeRight = writeLeft + 1;
            }

            for (int i = writeLeft; i < writeRight; i++) {
                nums[i] = nums[left];
            }
            writeLeft = writeRight;

            if (right < nums.length - 1) {
                right++;
                left = right;
            } else {
                break;
            }
        }

        return k;
    }
}
