package dsa_tutorial.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortedArraysTest {
    @Test
    public void example1Test() {
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6},
                new MergeSortedArrays().mergeSortedArrays(
                        new int[]{1, 3, 5},
                        new int[]{2, 4, 6})
        );
    }
}
