package top_interview_150.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchRotatedSortedArrayTest {
    @Test
    public void example1Test() {
        assertEquals(4, new SearchRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    public void example2Test() {
        assertEquals(-1, new SearchRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    public void example3Test() {
        assertEquals(-1, new SearchRotatedSortedArray().search(new int[]{1}, 0));
    }
}
