package leetcode75.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KokoEatingBananasTest {
    private final KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();

    @Test
    void example1() {
        assertEquals(4, kokoEatingBananas.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    @Test
    void example2() {
        assertEquals(30, kokoEatingBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
    }

    @Test
    void example3() {
        assertEquals(23, kokoEatingBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

    @Test
    void example4() {
        assertEquals(500_000_000, kokoEatingBananas.minEatingSpeed(new int[]{1_000_000_000}, 2));
    }

    @Test
    void example5() {
        assertEquals(3, kokoEatingBananas.minEatingSpeed(new int[]{805_306_368, 805_306_368, 805_306_368}, 1_000_000_000));
    }

    @Test
    void example6() {
        assertEquals(4, kokoEatingBananas.minEatingSpeed(new int[]{1, 4, 8}, 4));
    }
}
