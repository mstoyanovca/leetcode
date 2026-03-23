package dsa_summary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTempTest {
    @Test
    public void mergeSortTest() {
        assertArrayEquals(new int[]{1, 2, 3, 4,}, new MergeSortTemp().mergeSort(new int[]{4, 3, 2, 1}));
    }
}
