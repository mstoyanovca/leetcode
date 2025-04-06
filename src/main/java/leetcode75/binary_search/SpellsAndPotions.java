package leetcode75.binary_search;

import java.util.Arrays;

// problem 54:
public class SpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        final int n = spells.length;
        final int m = potions.length;
        int[] pairs = new int[n];

        Arrays.sort(potions);
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;

            // two pointers technique:
            while (left <= right) {
                int current = left + (right - left) / 2;
                if ((long) spells[i] * potions[current] >= success) {
                    right = --current;
                } else {
                    left = ++current;
                }
            }

            pairs[i] = m - left;
        }

        return pairs;
    }
}
