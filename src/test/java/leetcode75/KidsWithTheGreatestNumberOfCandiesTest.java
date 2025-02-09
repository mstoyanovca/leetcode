package leetcode75;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidsWithTheGreatestNumberOfCandiesTest {
    KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies = new KidsWithTheGreatestNumberOfCandies();

    @Test
    void example1() {
        assertEquals(new ArrayList<>(Arrays.asList(true, true, true, false, true)), kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    @Test
    void example2() {
        assertEquals(new ArrayList<>(Arrays.asList(true, false, false, false, false)), kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
    }

    @Test
    void example3() {
        assertEquals(new ArrayList<>(Arrays.asList(true, false, true)), kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{12, 1, 12}, 10));
    }
}
