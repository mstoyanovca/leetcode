package top_interview_150.graph;

public class SurroundedRegions {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        // mark all 'O's on an edge as not surrounded:
        boolean[][] isNotSurrounded = new boolean[m][n];

        // scan the first and last columns:
        for (int i = 0; i < m; i++) {
            // mark the entire island as not surrounded:
            if (board[i][0] == 'O' && !isNotSurrounded[i][0]) markIsNotSurrounded(i, 0, board, isNotSurrounded);
            if (board[i][n - 1] == 'O' && !isNotSurrounded[i][n - 1]) markIsNotSurrounded(i, n - 1, board, isNotSurrounded);
        }

        // scan the first and last rows:
        for (int j = 0; j < n; j++) {
            // mark the entire island as not surrounded:
            if (board[0][j] == 'O' && !isNotSurrounded[0][j]) markIsNotSurrounded(0, j, board, isNotSurrounded);
            if (board[m - 1][j] == 'O' && !isNotSurrounded[m - 1][j]) markIsNotSurrounded(m - 1, j, board, isNotSurrounded);
        }

        // time complexity O(m*n)
        // space complexity O(1)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !isNotSurrounded[i][j]) deleteIsland(i, j, board);
            }
        }
    }

    private void markIsNotSurrounded(int i, int j, char[][] board, boolean[][] isNotSurrounded) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 'X' || isNotSurrounded[i][j]) return;

        isNotSurrounded[i][j] = true;

        markIsNotSurrounded(i - 1, j, board, isNotSurrounded);
        markIsNotSurrounded(i + 1, j, board, isNotSurrounded);
        markIsNotSurrounded(i, j - 1, board, isNotSurrounded);
        markIsNotSurrounded(i, j + 1, board, isNotSurrounded);
    }

    private void deleteIsland(int i, int j, char[][] board) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 'X') return;

        board[i][j] = 'X';

        deleteIsland(i - 1, j, board);
        deleteIsland(i + 1, j, board);
        deleteIsland(i, j - 1, board);
        deleteIsland(i, j + 1, board);
    }
}
