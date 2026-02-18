package top_interview_150.graph;

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

    @Test
    public void example3Test() {
        char[][] board = new char[][]{
                {'O', 'O', 'O'},
                {'O', 'O', 'O'},
                {'O', 'O', 'O'}
        };
        char[][] expected = new char[][]{
                {'O', 'O', 'O'},
                {'O', 'O', 'O'},
                {'O', 'O', 'O'}
        };
        new SurroundedRegions().solve(board);

        assertArrayEquals(expected, board);
    }

    @Test
    public void example4Test() {
        char[][] board = new char[][]{
                {'X', 'O', 'X'},
                {'X', 'O', 'X'},
                {'X', 'O', 'X'}
        };
        char[][] expected = new char[][]{
                {'X', 'O', 'X'},
                {'X', 'O', 'X'},
                {'X', 'O', 'X'}
        };
        new SurroundedRegions().solve(board);

        assertArrayEquals(expected, board);
    }
}
