package leetcode150.graph;

public class SurroundedRegions {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') solveUtil(i, j, board);
            }
        }
    }

    private void solveUtil(int i, int j, char[][] board) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 'X') return;

        board[i][j] = 'X';

        solveUtil(i - 1, j, board);
        solveUtil(i + 1, j, board);
        solveUtil(i, j - 1, board);
        solveUtil(i, j + 1, board);
    }
}
