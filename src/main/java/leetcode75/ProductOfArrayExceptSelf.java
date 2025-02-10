package leetcode75;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] numbers) {
        int n = numbers.length;
        int[] prefixes = new int[n];
        int[] suffixes = new int[n];

        for (int i = 0; i < n; i++) {
            prefixes[i] = i == 0 ? numbers[0] : prefixes[i - 1] * numbers[i];
            int j = n - i - 1;
            suffixes[j] = j == n - 1 ? numbers[n - 1] : numbers[j] * suffixes[j + 1];
        }

        for (int i = 0; i < n; i++) {
            int prefix = i == 0 ? 1 : prefixes[i - 1];
            int suffix = i == n - 1 ? 1 : suffixes[i + 1];
            numbers[i] = prefix * suffix;
        }

        return numbers;
    }
}
