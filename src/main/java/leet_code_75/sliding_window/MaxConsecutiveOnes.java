package leet_code_75.sliding_window;

public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int zeroes = 0;
        int result = 0;

        while (right < nums.length) {
            if (nums[right] == 1) {
                result = Math.max(result, right - left + 1);
                right++;
            } else {
                if (zeroes < k) {
                    zeroes++;
                    result = Math.max(result, right - left + 1);
                    right++;
                } else {
                    if (nums[left] == 0) zeroes--;
                    left++;
                }
            }
        }

        return result;
    }
}
