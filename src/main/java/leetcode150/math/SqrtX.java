package leetcode150.math;

public class SqrtX {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int result = 0;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (middle * middle == x) {
                return middle;
            } else if (middle * middle > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
                // we are returning an integer result;
                // take the case where result^2 < x:
                result = middle;
            }
        }

        return result;
    }
}
