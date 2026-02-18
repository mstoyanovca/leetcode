package leet_code_75.prefix_sum;

public class FindPivotIndex {
    public int pivotIndex(int[] numbers) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;

        for (int number : numbers) totalSum += number;

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                rightSum = totalSum - numbers[i];
            } else if (i < numbers.length - 1) {
                leftSum += numbers[i - 1];
                rightSum -= numbers[i];
            } else {
                leftSum += numbers[i - 1];
                rightSum = 0;
            }
            if (leftSum == rightSum) return i;
        }

        return -1;
    }
}
