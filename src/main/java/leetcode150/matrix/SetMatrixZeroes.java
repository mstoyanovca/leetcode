package leetcode150.matrix;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean col0isZero = false;
        /*
        I use the first row as a flag which column has to be zeroed and the first column as a flag which row has to be zeroed;
        cell matrix[0][0] becomes ambiguous, its column function has to be extracted to a separate boolean flag,
        otherwise when you zero row 0 because of matrix[0][0] = 0, meaning only row 0 has to be zeroed,
        further scanning of the matrix will zero all columns, i.e. the entire matrix;
        */

        // I assume:
        // time complexity O(m*n)
        // space complexity O(1)
        for (int r = 0; r < rows; r++) {
            if (matrix[r][0] == 0) col0isZero = true;
            for (int c = 1; c < columns; c++) {
                if (matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                }

            }
        }

        for (int c = 1; c < columns; c++) if (matrix[0][c] == 0) for (int r = 0; r < rows; r++) matrix[r][c] = 0;
        for (int r = 0; r < rows; r++) if (matrix[r][0] == 0) for (int c = 0; c < columns; c++) matrix[r][c] = 0;
        if (col0isZero) for (int r = 0; r < rows; r++) matrix[r][0] = 0;
    }
}
