package leetcode75;

import leetcode75.hashmap_set.EqualRowAndColumnPairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualRowAndColumnPairsTest {
    private final EqualRowAndColumnPairs rowAndColumnPairs = new EqualRowAndColumnPairs();

    @Test
    void example1() {
        assertEquals(1, rowAndColumnPairs.equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
    }

    @Test
    void example2() {
        assertEquals(3, rowAndColumnPairs.equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));
    }

    @Test
    void example3() {
        assertEquals(3, rowAndColumnPairs.equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 4}, {2, 4, 2, 2}, {2, 5, 2, 2}}));
    }
}
