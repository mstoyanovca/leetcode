package leetcode150.array_string;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                prefix[i] = 1;
            } else if (i == 1) {
                prefix[i] = nums[0];
            } else {
                prefix[i] = prefix[i - 1] * nums[i - 1];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                suffix[i] = 1;
            } else if (i == n - 2) {
                suffix[i] = nums[n - 1];
            } else {
                suffix[i] = suffix[i + 1] * nums[i + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
    }
}
