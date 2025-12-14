package leetcode150.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertIntervalTest {
    @Test
    public void example1Test() {
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, new InsertInterval().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
    }

    @Test
    public void example2Test() {
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, new InsertInterval().insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}));
    }
}
