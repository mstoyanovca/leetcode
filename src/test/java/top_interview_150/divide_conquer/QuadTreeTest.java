package top_interview_150.divide_conquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadTreeTest {
    @Test
    public void example1Test() {
        int[][] grid = new int[][]{{0, 1}, {1, 0}};
        Node expected = new Node(true, false,
                new Node(false, true),
                new Node(true, true),
                new Node(true, true),
                new Node(false, true));

        assertEquals(expected, new QuadTree().construct(grid));
    }

    @Test
    public void example2Test() {
        int[][] grid = new int[][]{
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        };
        Node expected = new Node(true, false,
                new Node(true, true),
                new Node(true, false,
                        new Node(false, true),
                        new Node(false, true),
                        new Node(true, true),
                        new Node(true, true)
                ),
                new Node(true, true),
                new Node(false, true)
        );

        assertEquals(expected, new QuadTree().construct(grid));
    }
}
