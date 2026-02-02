package leetcode150.math;

public class PowXN {
    public double myPow(double x, int n) {
        if (n < 0) return myPow(1 / x, -n);
        if (n == 0) return 1;
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return myPow(x * x, (n - 1) / 2) * x;
        }
    }

    public double myPow2(double x, int n) {
        if (n < 0) return myPow(1 / x, -n);

        double result = 1;
        while (n != 0) {
            result *= x;
            n--;
        }

        return result;
    }
}
