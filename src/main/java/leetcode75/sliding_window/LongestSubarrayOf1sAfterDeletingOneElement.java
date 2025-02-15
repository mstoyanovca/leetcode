package leetcode75.sliding_window;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] numbers) {
        int zeroes = 0;
        boolean allOnes = true;
        int length = 0;
        int maxLength = 0;

        // create the window:
        for (int number : numbers) {
            if (number == 1) {
                // expand to the right by adding 1s:
                length++;
                maxLength = Math.max(length, maxLength);
            } else {
                // expand to the right by flipping a 0:
                if (zeroes == 0) {
                    zeroes = 1;
                    allOnes = false;
                    maxLength = Math.max(length, maxLength);
                } else {
                    break;
                }
            }
        }

        // slide the window:
        for (int i = length + zeroes; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                // expand to the right by adding 1s:
                length++;
                maxLength = Math.max(length, maxLength);
            } else {
                if (zeroes == 0) {
                    // expand to the right by flipping a 0:
                    zeroes = 1;
                    allOnes = false;
                    length++;
                    maxLength = Math.max(length, maxLength);
                } else {
                    // hit a zero on the right, free a zero on the left:
                    while (length + zeroes < numbers.length && numbers[i - length - zeroes] == 1) {
                        length--;
                    }
                }
            }
        }

        return allOnes ? maxLength - 1 : maxLength;
    }
}
