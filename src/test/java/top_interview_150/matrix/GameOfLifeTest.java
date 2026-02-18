package top_interview_150.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GameOfLifeTest {
    @Test
    public void example1Test() {
        int[][] board = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        new GameOfLife().gameOfLife(board);
        assertArrayEquals(new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}}, board);
    }

    @Test
    public void example2Test() {
        int[][] board = {{1, 1}, {1, 0}};
        new GameOfLife().gameOfLife(board);
        assertArrayEquals(new int[][]{{1, 1}, {1, 1}}, board);
    }
}
