package leetcode150.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfArrowsTest {
    @Test
    public void example1Test() {
        assertEquals(2, new MinimumNumberOfArrows().findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}));
    }

    @Test
    public void example2Test() {
        assertEquals(4, new MinimumNumberOfArrows().findMinArrowShots(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}));
    }

    @Test
    public void example3Test() {
        assertEquals(2, new MinimumNumberOfArrows().findMinArrowShots(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}));
    }
}
