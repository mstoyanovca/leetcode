package top_interview_150.array_string;

public class RemoveDuplicatesFromSortedArray1 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        // use 3 pointers: left, right and k:
        int left = 0;
        int right = 0;
        int k = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (right < n) {
            if (nums[right] == nums[left]) {
                right++;
            } else {
                k++;
                nums[k] = nums[right];
                left = right;
            }
        }

        return ++k;
    }
}
