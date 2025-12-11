package leetcode150.matrix;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean col0isZero = false;
        /*
        the first row is a flag which column has to be zeroed;
        the first column is a flag which row has to be zeroed;
        cell matrix[0][0] becomes ambiguous, its column function has to be extracted to a separate boolean flag;
        otherwise when you zero row 0 because of matrix[0][0], meaning only row 0 has to be zeroed,
        further scanning of the matrix will zero all columns, i.e. the entire matrix;
        */

        // I assume:
        // time complexity O(m*n)
        // space complexity O(1)
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                    if (c == 0) col0isZero = true;
                }

            }
        }

        for (int r = rows - 1; r >= 0; r--) {
            for (int c = columns - 1; c >= 0; c--) {
                if (matrix[0][c] == 0 || matrix[r][0] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }
        int x = 0;
    }
}
