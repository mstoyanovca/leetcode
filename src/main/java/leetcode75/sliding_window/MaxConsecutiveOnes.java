package leetcode75.sliding_window;

public class MaxConsecutiveOnes {
    public int longestOnes(int[] numbers, int k) {
        int windowLength = 0;
        int maxWindowLength = 0;
        int zeroes = 0;

        // create a window:
        for (int number : numbers) {
            if (number == 1) {
                // expand to the right by adding 1s:
                windowLength++;
                maxWindowLength = Math.max(windowLength, maxWindowLength);
            } else {
                // expand to the right by flipping 0s:
                if (zeroes < k) {
                    zeroes++;
                    windowLength++;
                    maxWindowLength = Math.max(windowLength, maxWindowLength);
                } else {
                    break;
                }
            }
        }

        // slide the window:
        for (int i = windowLength; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                // expand to the right by adding 1s:
                windowLength++;
                maxWindowLength = Math.max(windowLength, maxWindowLength);
            } else {
                // expand to the right by flipping 0s:
                if (zeroes < k) {
                    zeroes++;
                    windowLength++;
                    maxWindowLength = Math.max(windowLength, maxWindowLength);
                } else {
                    // hit a zero on the right, free a zero on the left:
                    while (windowLength > 0 && numbers[i - windowLength] == 1) windowLength--;
                }
            }
        }

        return maxWindowLength;
    }
}
