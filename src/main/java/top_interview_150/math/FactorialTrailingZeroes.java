package top_interview_150.math;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        return trailingZeroesUtil(n, 0);
    }

    private int trailingZeroesUtil(int n, int acc) {
        if (n == 0) return acc;
        return trailingZeroesUtil(n / 5, acc + n / 5);
    }
}
