package leet_code_75.binary_search;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            // middle is an index:
            if (guess(middle + 1) == -1) {
                right = middle - 1;
            } else if (guess(middle + 1) == 1) {
                left = middle + 1;
            } else {
                return middle + 1;
            }
        }

        return -1;
    }

    private int guess(int num) {
        int pick = 1;
        return Integer.compare(pick, num);
    }
}
