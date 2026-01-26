package leetcode150.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FirstLastPositionInSortedArrayTest {
    @Test
    public void example1Test() {
        assertArrayEquals(new int[]{3, 4}, new FirstLastPositionInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    @Test
    public void example2Test() {
        assertArrayEquals(new int[]{-1, -1}, new FirstLastPositionInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }

    @Test
    public void example3Test() {
        assertArrayEquals(new int[]{-1, -1}, new FirstLastPositionInSortedArray().searchRange(new int[]{}, 0));
    }
}
