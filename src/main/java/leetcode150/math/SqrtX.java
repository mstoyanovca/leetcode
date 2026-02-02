package leetcode150.math;

public class SqrtX {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int result = 0;

        while (left <= right) {
            long middle = left + (right - left) / 2;
            long temp = middle * middle;

            if (temp == x) {
                return (int) middle;
            } else if (temp > x) {
                right = (int) (middle - 1);
            } else {
                left = (int) (middle + 1);
                // we are returning an integer result, take the case where result^2 < x:
                result = (int) middle;
            }
        }

        return result;
    }
}
