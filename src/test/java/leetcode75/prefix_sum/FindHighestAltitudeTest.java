package leetcode75.prefix_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindHighestAltitudeTest {
    private final FindHighestAltitude highestAltitude = new FindHighestAltitude();

    @Test
    void example1() {
        assertEquals(1, highestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }

    @Test
    void example2() {
        assertEquals(0, highestAltitude.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }
}
