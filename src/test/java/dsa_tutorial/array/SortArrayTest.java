package dsa_tutorial.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortArrayTest {
    @Test
    public void example1Test() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new SortArray().sortAscending(new int[]{8, 3, 5, 4, 7, 6, 1, 2}));
    }

    @Test
    public void example2Test() {
        assertArrayEquals(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, new SortArray().sortDescending(new int[]{8, 3, 5, 4, 7, 6, 1, 2}));
    }

    @Test
    public void example3Test() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new SortArray().mergeSort(new int[]{8, 3, 5, 4, 7, 6, 1, 2}));
    }
}
