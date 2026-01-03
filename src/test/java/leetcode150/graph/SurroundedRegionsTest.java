package leetcode150.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SurroundedRegionsTest {
    @Test
    public void example1Test() {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] expected = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        new SurroundedRegions().solve(board);

        assertArrayEquals(expected, board);
    }

    @Test
    public void example2Test() {
        char[][] board = new char[][]{{'X'}};
        char[][] expected = new char[][]{{'X'}};

        new SurroundedRegions().solve(board);

        assertArrayEquals(expected, board);
    }
}
