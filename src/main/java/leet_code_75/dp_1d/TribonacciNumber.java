package leet_code_75.dp_1d;

// problem 59:
public class TribonacciNumber {
    // 0 <= n <= 37
    public int tribonacci(int n) {
        return createF()[n];
    }

    private int[] createF() {
        int[] f = new int[38];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < 38; i++) f[i] = f[i - 1] + f[i - 2] + f[i - 3];
        return f;
    }
}
