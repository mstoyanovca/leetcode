package leetcode150.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;

        for (int i = 0; i < columns; i++) {
            result.add(matrix[row][i]);
        }
        row++;
        for (int i = row; i < rows; i++) {
            result.add(matrix[i][column]);
        }
        columns--;
        for (int i = columns - 1; i >= 0; i--) {
            result.add(matrix[rows - 1][i]);
        }
        rows--;
        for (int i = rows - 1; i < row; i--) {
            result.add(matrix[i][0]);
        }

        return result;
    }
}
