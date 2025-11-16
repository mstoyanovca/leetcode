package leetcode150.array_string;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result = nums.length;
        int left = 0;
        int right = nums.length > 0 ? nums.length - 1 : 0;

        while (left != right) {
            if (nums[right] == val) {
                // move the right pointer to the left, till it hits a non-val:
                right--;
                result--;
            } else if (nums[left] != val) {
                // move the left pointer to the right, till it hits a val:
                left++;
            } else if (nums[left] == val && nums[right] != val) {
                // swap them:
                nums[left] = nums[right];
                nums[right] = val;
                right--;
                result--;
            }
        }

        if (nums.length > 0 && nums[left] == val) {
            nums = new int[0];
            result = 0;
        }

        return result;
    }
}
