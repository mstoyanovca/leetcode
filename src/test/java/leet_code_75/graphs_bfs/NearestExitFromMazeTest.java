package leet_code_75.graphs_bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NearestExitFromMazeTest {
    private final NearestExitFromMaze nearestExit = new NearestExitFromMaze();

    @Test
    void example1() {
        char[][] maze = new char[][]{{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}};
        int[] entrance = new int[]{1, 2};

        assertEquals(1, nearestExit.nearestExit(maze, entrance));
    }

    @Test
    void example2() {
        char[][] maze = new char[][]{{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}};
        int[] entrance = new int[]{1, 0};

        assertEquals(2, nearestExit.nearestExit(maze, entrance));
    }

    @Test
    void example3() {
        char[][] maze = new char[][]{{'.', '+'}};
        int[] entrance = new int[]{0, 0};

        assertEquals(-1, nearestExit.nearestExit(maze, entrance));
    }

    @Test
    void example4() {
        char[][] maze = new char[][]{{'.', '.'}};
        int[] entrance = new int[]{0, 1};

        assertEquals(1, nearestExit.nearestExit(maze, entrance));
    }
}
