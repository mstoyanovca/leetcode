package leetcode150.array_string;

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;
        int left = 0;
        int right = 0;
        int writeStart = 0;
        int writeEnd = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (right < nums.length) {
            while (nums[right] == nums[left] && right < nums.length - 1) {
                right++;
            }
            // edge case, when all numbers are the same:
            if (right == nums.length - 1 && nums[right] == nums[0]) break;
            if (nums[right] > nums[left]) {
                if (right - left >= 2) {
                    writeEnd = writeStart + 2;
                } else {
                    writeEnd = writeStart + 1;
                }
                for (int i = writeStart; i < writeEnd; i++) {
                    nums[i] = nums[left];
                }
                left = right;
                writeStart = writeEnd;
                k++;
            }

            /*if (nums[left] == nums[right] && right - left <= 1) {
                right++;
            } else if (nums[left] == nums[right] && right - left >= 2) {

            } else if (nums[right] > nums[left]) {

            }*/
        }

        return k;
    }
}
