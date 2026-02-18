package top_interview_150.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfIslandsTest {
    @Test
    public void example1Test() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        assertEquals(1, new NumberOfIslands().numIslands(grid));
    }

    @Test
    public void example2Test() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        assertEquals(3, new NumberOfIslands().numIslands(grid));
    }

    @Test
    public void example3Test() {
        char[][] grid = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'},
        };

        assertEquals(1, new NumberOfIslands().numIslands(grid));
    }

    @Test
    public void example4Test() {
        char[][] grid = new char[][]{
                {'0', '1', '0'},
                {'1', '0', '1'},
                {'0', '1', '0'},
        };

        assertEquals(4, new NumberOfIslands().numIslands(grid));
    }
}
