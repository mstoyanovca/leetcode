package leetcode150.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {
    @Test
    public void example1Test() {
        assertEquals(2.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    public void example2Test() {
        assertEquals(2.5, new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
