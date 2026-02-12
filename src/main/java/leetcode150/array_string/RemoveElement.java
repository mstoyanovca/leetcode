package leetcode150.array_string;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        if (n == 0) return 0;
        int left = 0;
        int right = Math.max(0, n - 1);
        int result = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (right >= left) {
            if (nums[right] == val) {
                right--;
                continue;
            }
            if (nums[left] == val) {
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
