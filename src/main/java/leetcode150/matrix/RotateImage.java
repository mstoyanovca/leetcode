package leetcode150.matrix;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // time complexity O(n*2)
        // space complexity O(1)
        for (int r = 0; r < n / 2; r++) {
            for (int c = r; c < n - r - 1; c++) {
                int acc = matrix[r][c];
                matrix[r][c] = matrix[n - c - 1][r];
                matrix[n - c - 1][r] = matrix[n - r - 1][n - c - 1];
                matrix[n - r - 1][n - c - 1] = matrix[c][n - r - 1];
                matrix[c][n - r - 1] = acc;
            }
        }
    }
}
