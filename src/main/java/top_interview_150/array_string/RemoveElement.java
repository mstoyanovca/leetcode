package top_interview_150.array_string;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int result = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (right >= left) {
            if (nums[right] == val) {
                right--;
            } else if (nums[left] == val) {
                nums[left] = nums[right];
                left++;
                right--;
                result++;
            } else {
                left++;
                result++;
            }
        }

        return result;
    }
}
