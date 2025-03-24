package leetcode75.graphs_bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RottingOrangesTest {
    private final RottingOranges rottingOranges = new RottingOranges();

    @Test
    void example1() {
        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};

        assertEquals(4, rottingOranges.orangesRotting(grid));
    }

    @Test
    void example2() {
        int[][] grid = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};

        assertEquals(-1, rottingOranges.orangesRotting(grid));
    }

    @Test
    void example3() {
        int[][] grid = new int[][]{{0, 2}};

        assertEquals(0, rottingOranges.orangesRotting(grid));
    }

    @Test
    void example4() {
        int[][] grid = new int[][]{{0}};

        assertEquals(0, rottingOranges.orangesRotting(grid));
    }
}
