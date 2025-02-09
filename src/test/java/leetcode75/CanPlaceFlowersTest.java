package leetcode75;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CanPlaceFlowersTest {
    CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

    @Test
    void example1() {
        assertEquals(new ArrayList<>(Arrays.asList(true, true, true, false, true)), canPlaceFlowers.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }
}
