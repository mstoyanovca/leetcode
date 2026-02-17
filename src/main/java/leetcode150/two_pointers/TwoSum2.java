package leetcode150.two_pointers;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n - 1;
        int[] result = new int[2];

        // time complexity O(n)
        // space complexity O(1)
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }

        return result;
    }
}
