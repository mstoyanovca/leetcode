package leetcode150.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordSearchTest {
    @Test
    public void example1Test() {
        assertTrue(new WordSearch().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
    }

    @Test
    public void example2Test() {
        assertTrue(new WordSearch().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE"));
    }

    @Test
    public void example3Test() {
        assertFalse(new WordSearch().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));
    }

    @Test
    public void example4Test() {
        assertTrue(new WordSearch().exist(new char[][]{{'a', 'b'}}, "ba"));
    }

    @Test
    public void example5Test() {
        assertFalse(new WordSearch().exist(new char[][]{{'b'}, {'a'}, {'b'}, {'b'}, {'a'}}, "baa"));
    }
}
