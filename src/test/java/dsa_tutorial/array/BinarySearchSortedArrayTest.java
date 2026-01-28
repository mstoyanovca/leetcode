package dsa_tutorial.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchSortedArrayTest {
    @Test
    public void example1Test() {
        assertEquals(4, new BinarySearchSortedArray().binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 5));
    }

    @Test
    public void example2Test() {
        assertEquals(-1, new BinarySearchSortedArray().binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 9));
    }
}
