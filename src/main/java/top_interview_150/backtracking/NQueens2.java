package top_interview_150.backtracking;

public class NQueens2 {
    private int result = 0;

    public int totalNQueens(int n) {
        backtrack(0, n, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
        return result;
    }

    // there can only be 1 queen in a row:
    private void backtrack(int row, int n, boolean[] columns, boolean[] diagonal1, boolean[] diagonal2) {
        // for each row, find a safe column:
        for (int column = 0; column < n; column++) {
            if (columns[column]) continue;
            // left to right, top to bottom, 0 to n - 1:
            int diagonal1Index = row - column + n - 1;
            if (diagonal1[diagonal1Index]) continue;
            // right to left, top to bottom, 0 to n - 1:
            int diagonal2Index = row + column;
            if (diagonal2[diagonal2Index]) continue;

            if (row == n - 1) {
                // checked all rows for the current column:
                result++;
            } else {
                columns[column] = true;
                diagonal1[diagonal1Index] = true;
                diagonal2[diagonal2Index] = true;

                backtrack(row + 1, n, columns, diagonal1, diagonal2);

                columns[column] = false;
                diagonal1[diagonal1Index] = false;
                diagonal2[diagonal2Index] = false;
            }
        }
    }
}
