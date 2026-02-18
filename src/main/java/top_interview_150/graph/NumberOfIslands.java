package top_interview_150.graph;

public class NumberOfIslands {
    private int islands = 0;

    public int numIslands(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') islands++;
                numIslandsUtil(i, j, grid);
            }
        }

        return islands;
    }

    private void numIslandsUtil(int i, int j, char[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;

        grid[i][j] = '0';

        numIslandsUtil(i - 1, j, grid);
        numIslandsUtil(i + 1, j, grid);
        numIslandsUtil(i, j - 1, grid);
        numIslandsUtil(i, j + 1, grid);
    }
}
