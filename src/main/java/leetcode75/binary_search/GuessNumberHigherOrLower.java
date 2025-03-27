package leetcode75.binary_search;

// problem 53:
public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        if (n == 1) return 1;
        return dfs(n / 2, 1, n);
    }

    private int dfs(int guess, int lowerLimit, int upperLimit) {
        return switch (guess(guess)) {
            case -1 ->
                // your guess is higher than the number I picked:
                    dfs(guess / 2, lowerLimit, guess);
            case 1 ->
                // your guess is lower than the number I picked
                // dfs((int) (guess + Math.ceil((double) (upperLimit - guess) / 2)), guess, upperLimit);
                    dfs(guess + (upperLimit - guess + 1) / 2, guess, upperLimit);
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
