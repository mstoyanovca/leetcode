package leet_code_75.graphs_dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorderRoutesTest {
    private final ReorderRoutes reorderRoutes = new ReorderRoutes();

    @Test
    void example1() {
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};

        assertEquals(3, reorderRoutes.minReorder(6, connections));
    }

    @Test
    void example2() {
        int[][] connections = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};

        assertEquals(2, reorderRoutes.minReorder(5, connections));
    }

    @Test
    void example3() {
        int[][] connections = {{1, 0}, {2, 0}};

        assertEquals(0, reorderRoutes.minReorder(3, connections));
    }

    @Test
    void example4() {
        int[][] connections = {{0, 2}, {0, 3}, {4, 1}, {4, 5}, {5, 0}};

        assertEquals(3, reorderRoutes.minReorder(6, connections));
    }
}
