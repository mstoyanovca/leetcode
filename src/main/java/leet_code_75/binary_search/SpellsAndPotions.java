package leet_code_75.binary_search;

import java.util.Arrays;

public class SpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        final int n = spells.length;
        final int m = potions.length;
        int[] pairs = new int[n];

        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;

            while (left <= right) {
                int middle = left + (right - left) / 2;

                if ((long) spells[i] * potions[middle] >= success) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }

            pairs[i] = m - left;
        }

        return pairs;
    }
}
