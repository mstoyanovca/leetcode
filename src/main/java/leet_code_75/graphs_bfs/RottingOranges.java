package leet_code_75.graphs_bfs;

import java.util.LinkedList;
import java.util.Queue;

// problem 47:
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> rottenOranges = createQueue(grid);
        // left, right, up and down:
        int[][] directions = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int minutes = 0;

        while (!rottenOranges.isEmpty()) {
            minutes++;
            int size = rottenOranges.size();
            for (int i = 0; i < size; i++) {
                int[] rottenOrange = rottenOranges.remove();
                for (int[] direction : directions) {
                    if (isFreshOrange(grid, rottenOrange, direction)) {
                        int x = rottenOrange[0] + direction[0];
                        int y = rottenOrange[1] + direction[1];
                        grid[x][y] = 2;
                        rottenOranges.add(new int[]{x, y});
                    }
                }
            }
        }

        return freshOrangeLeft(grid) ? -1 : Math.max(minutes - 1, 0);
    }

    private Queue<int[]> createQueue(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == 2) queue.add(new int[]{row, column});
            }
        }

        return queue;
    }

    private boolean isFreshOrange(int[][] grid, int[] rottenOrange, int[] direction) {
        int rows = grid.length;
        int columns = grid[0].length;
        int x = rottenOrange[0] + direction[0];
        int y = rottenOrange[1] + direction[1];

        return x >= 0 && x < rows && y >= 0 && y < columns && grid[x][y] == 1;
    }

    private boolean freshOrangeLeft(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == 1) return true;
            }
        }
        return false;
    }
}
