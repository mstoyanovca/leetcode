package leetcode150.array_string;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // time complexity O(n)
        // space complexity O(1)
        // use the result as an in-place suffix array:
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                result[i] = 1;
            } else if (i == n - 2) {
                result[i] = nums[i + 1];
            } else {
                result[i] = result[i + 1] * nums[i + 1];
            }
        }
        // use the input as an in-place prefix array:
        int acc = nums[0];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                nums[i] = 1;
            } else if (i == 1) {
                int temp = nums[i];
                nums[i] = nums[i - 1] * acc;
                acc = temp;
            } else {
                int temp = nums[i];
                nums[i] = nums[i - 1] * acc;
                acc = temp;
            }
        }
        // each result[i] = prefix[i] * suffix[i]:
        // calculate suffix first, before you overwrite the input array :)
        for (int i = 0; i < n; i++) {
            result[i] *= nums[i];
        }

        return result;
    }
}
