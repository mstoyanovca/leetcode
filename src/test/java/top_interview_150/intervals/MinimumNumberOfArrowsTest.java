package top_interview_150.intervals;

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

    @Test
    public void example4Test() {
        assertEquals(2, new MinimumNumberOfArrows().findMinArrowShots(new int[][]{{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}}));
    }
}
