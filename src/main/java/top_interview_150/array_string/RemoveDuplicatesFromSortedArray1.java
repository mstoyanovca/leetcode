package top_interview_150.array_string;

public class RemoveDuplicatesFromSortedArray1 {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }

        return k + 1;
    }
}
