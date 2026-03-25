package dsa_summary.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    public void example1Test() {
        assertEquals(4, new BinarySearch().binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 5));
    }

    @Test
    public void example2Test() {
        assertEquals(-1, new BinarySearch().binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 9));
    }
}
