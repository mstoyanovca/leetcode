package leet_code_75.binary_search;

// problem 53:
public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        if (n == 1) return 1;
        return binarySearch(n / 2, 1, n);
    }

    // recursive:
    private int binarySearch(int guess, int lowerLimit, int upperLimit) {
        return switch (guess(guess)) {
            case -1 ->
                // your guess is higher than the number I picked, it rounds down:
                    binarySearch(guess / 2, lowerLimit, guess);
            case 1 ->
                // your guess is lower than the number I picked, add 1 to round up:
                    binarySearch(guess + (upperLimit - guess + 1) / 2, guess, upperLimit);
            default ->
                // your guess is equal to the number I picked:
                    guess;
        };
    }

    private int guess(int num) {
        int pick = 2;
        return Integer.compare(pick, num);
    }
}
