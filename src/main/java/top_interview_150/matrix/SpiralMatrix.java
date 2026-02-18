package top_interview_150.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int columns = matrix[0].length;
        int startRow = 0;
        int endRow = rows - 1;
        int startColumn = 0;
        int endColumn = columns - 1;

        while (result.size() < rows * columns) {
            for (int i = startColumn; i <= endColumn; i++) {
                result.add(matrix[startRow][i]);
            }
            if (result.size() == rows * columns) break;
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endColumn]);
            }
            if (result.size() == rows * columns) break;
            endColumn--;
            for (int i = endColumn; i >= startColumn; i--) {
                result.add(matrix[endRow][i]);
            }
            if (result.size() == rows * columns) break;
            endRow--;
            for (int i = endRow; i >= startRow; i--) {
                result.add(matrix[i][startColumn]);
            }
            if (result.size() == rows * columns) break;
            startColumn++;
        }

        return result;
    }
}
