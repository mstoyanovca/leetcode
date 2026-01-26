package leetcode150.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {
    @Test
    public void example1Test() {
        assertEquals(1, new FindMinimumInRotatedSortedArray().findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void example2Test() {
        assertEquals(0, new FindMinimumInRotatedSortedArray().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    public void example3Test() {
        assertEquals(11, new FindMinimumInRotatedSortedArray().findMin(new int[]{11, 13, 15, 17}));
    }

    @Test
    public void example4Test() {
        assertEquals(1, new FindMinimumInRotatedSortedArray().findMin(new int[]{2, 1}));
    }
}
