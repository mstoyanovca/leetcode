package dsa_summary.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void mergeSortTest() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new MergeSort().mergeSort(new int[]{8, 3, 5, 4, 7, 6, 1, 2}));
    }
}
