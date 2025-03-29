package leetcode75.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SpellsAndPotionsTest {
    private final SpellsAndPotions spellsAndPotions = new SpellsAndPotions();

    @Test
    void example1() {
        int[] spells = new int[]{5, 1, 3};
        int[] potions = new int[]{1, 2, 3, 4, 5};
        int[] pairs = new int[]{4, 0, 3};

        assertArrayEquals(pairs, spellsAndPotions.successfulPairs(spells, potions, 7));
    }

    @Test
    void example2() {
        int[] spells = new int[]{3, 1, 2};
        int[] potions = new int[]{8, 5, 8};
        int[] pairs = new int[]{2, 0, 2};

        assertArrayEquals(pairs, spellsAndPotions.successfulPairs(spells, potions, 16));
    }
}
