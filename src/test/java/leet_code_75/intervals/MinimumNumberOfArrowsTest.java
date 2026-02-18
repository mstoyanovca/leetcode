package leet_code_75.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfArrowsTest {
    private final MinimumNumberOfArrows minimumNumber = new MinimumNumberOfArrows();

    @Test
    void example1() {
        assertEquals(2, minimumNumber.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}));
    }

    @Test
    void example2() {
        assertEquals(4, minimumNumber.findMinArrowShots(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}));
    }

    @Test
    void example3() {
        assertEquals(2, minimumNumber.findMinArrowShots(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}));
    }
}
