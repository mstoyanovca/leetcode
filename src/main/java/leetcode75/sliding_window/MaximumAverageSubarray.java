package leetcode75.sliding_window;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] numbers, int k) {
        int sum = 0;
        double maxAverage;

        for (int i = 0; i < k; i++) {
            sum += numbers[i];
        }
        maxAverage = (double) sum / k;

        for (int i = 1; i < numbers.length - k + 1; i++) {
            sum = sum - numbers[i - 1] + numbers[i + k - 1];
            double average = (double) sum / k;
            if (average > maxAverage) maxAverage = average;
        }

        return maxAverage;
    }
}
