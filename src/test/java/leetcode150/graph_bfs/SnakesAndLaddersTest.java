package leetcode150.graph_bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakesAndLaddersTest {
    @Test
    public void example1Test() {
        int[][] board = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };

        assertEquals(4, new SnakesAndLadders().snakesAndLadders(board));
    }

    @Test
    public void example2Test() {
         assertEquals(1, new SnakesAndLadders().snakesAndLadders(new int[][]{{-1, -1}, {-1, -3}}));
    }
}
