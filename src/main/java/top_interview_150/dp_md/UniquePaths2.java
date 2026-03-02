package top_interview_150.dp_md;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // first element:
        obstacleGrid[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        // first column:
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i - 1][0] == 0 || obstacleGrid[i][0] == 1) {
                obstacleGrid[i][0] = 0;
            } else {
                obstacleGrid[i][0] = 1;
            }
        }
        // first row:
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j - 1] == 0 || obstacleGrid[0][j] == 1) {
                obstacleGrid[0][j] = 0;
            } else {
                obstacleGrid[0][j] = 1;
            }
        }
        // all other elements:
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }
        }

        return obstacleGrid[m - 1][n - 1];
    }
}
