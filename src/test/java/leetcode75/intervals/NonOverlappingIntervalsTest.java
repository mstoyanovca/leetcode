package leetcode75.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonOverlappingIntervalsTest {
    private final NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();

    @Test
    void example1() {
        assertEquals(1, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
    }

    @Test
    void example2() {
        assertEquals(2, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
    }

    @Test
    void example3() {
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
    }

    @Test
    void example4() {
        assertEquals(2, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}}));
    }
}
