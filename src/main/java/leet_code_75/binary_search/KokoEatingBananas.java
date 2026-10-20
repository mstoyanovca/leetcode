package leet_code_75.binary_search;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = findMax(piles);

        while (left <= right) {
            int middle = left + (right - left + 1) / 2;
            if (eatsAllWithinTime(piles, middle, h)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }

    private int findMax(int[] piles) {
        int max = 0;
        for (int pile : piles) max = Math.max(pile, max);
        return max;
    }

    private boolean eatsAllWithinTime(int[] piles, int k, int h) {
        int hoursToEatAll = 0;
        for (int pile : piles) {
            if (k >= pile) {
                hoursToEatAll++;
            } else {
                hoursToEatAll += pile % k == 0 ? pile / k : pile / k + 1;
            }
        }
        return hoursToEatAll <= h;
    }
}
