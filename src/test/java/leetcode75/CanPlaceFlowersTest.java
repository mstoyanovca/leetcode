package leetcode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanPlaceFlowersTest {
    CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

    @Test
    void example1() {
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    void example2() {
        assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }
}
