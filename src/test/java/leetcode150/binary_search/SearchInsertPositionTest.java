package leetcode150.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {
    @Test
    public void example1Test() {
        assertEquals(2, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    public void example3Test() {
        assertEquals(4, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
