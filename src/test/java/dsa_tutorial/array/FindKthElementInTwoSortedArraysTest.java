package dsa_tutorial.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindKthElementInTwoSortedArraysTest {
    @Test
    public void example1Test() {
        int[] a = new int[]{2, 3, 6, 7, 9};
        int[] b = new int[]{1, 4, 8, 10};

        assertEquals(6, new FindKthElementInTwoSortedArrays().findKthElement(a, b, 5));
    }
}
