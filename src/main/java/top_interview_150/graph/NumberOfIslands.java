package top_interview_150.graph;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int numberOfIslands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    numberOfIslands++;
                    deleteIsland(i, j, grid);
                }
            }
        }

        return numberOfIslands;
    }

    private void deleteIsland(int i, int j, char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        deleteIsland(i + 1, j, grid);
        deleteIsland(i - 1, j, grid);
        deleteIsland(i, j + 1, grid);
        deleteIsland(i, j - 1, grid);
    }
}
