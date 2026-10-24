package top_interview_150.array_string;

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        // time complexity O(n)
        // space complexity O(1)
        for (int num : nums) {
            if (k < 2 || num > nums[k - 2]) {
                nums[k] = num;
                k++;
            }
        }

        return k;
    }
}
