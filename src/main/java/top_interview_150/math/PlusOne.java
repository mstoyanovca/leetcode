package top_interview_150.math;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // this is either the last digit, or due to overflow:
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        // if you reach this line, all digits are 0, you need one more:
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
