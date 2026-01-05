package leetcode150.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeIntervalsTest {
    @Test
    public void example1Test() {
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, new MergeIntervals().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    public void example2Test() {
        assertArrayEquals(new int[][]{{1, 5}}, new MergeIntervals().merge(new int[][]{{1, 4}, {4, 5}}));
    }

    @Test
    public void example3Test() {
        assertArrayEquals(new int[][]{{1, 7}}, new MergeIntervals().merge(new int[][]{{4, 7}, {1, 4}}));
    }

    @Test
    public void example4Test() {
        assertArrayEquals(new int[][]{{1, 4}}, new MergeIntervals().merge(new int[][]{{1, 4}, {2, 3}}));
    }
}
