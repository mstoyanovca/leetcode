package leetcode150.graph;

public class NumberOfIslands {
    private int islands = 0;

    public int numIslands(char[][] grid) {
        // scan from left to right, and top to bottom;
        // find '1' cells with both cells before (on the left and above) '0':
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    // it's a new island:
                    if (i == 0 && j == 0) {
                        // the first (top left) cell:
                        islands++;
                        grid[i][j] = 'i';
                    } else if (i == 0 && grid[i][j - 1] == '0') {
                        // the first row:
                        islands++;
                        grid[i][j] = 'i';
                    } else if (j == 0 && grid[i - 1][j] == '0') {
                        // the first column:
                        islands++;
                        grid[i][j] = 'i';
                    } else if (i > 0 && grid[i - 1][j] == '0' && j > 0 && grid[i][j - 1] == '0') {
                        islands++;
                        grid[i][j] = 'i';
                    }
                }
            }
        }

        return islands;
    }
}
