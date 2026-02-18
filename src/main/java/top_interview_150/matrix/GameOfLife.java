package top_interview_150.matrix;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        /* convention:
           0 - dead cells, remain dead on the second pass
           1 - live cells, remain live on the second pass
           2 - dead cells to turn live
           3 - live cells to die
        */

        // time complexity O(m*n)
        // space complexity O(1)
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                int liveNeighbours = countLiveNeighbours(r, c, board);

                if (board[r][c] == 1) {
                    // live cells:
                    if (liveNeighbours < 2) {
                        // dies from under-population:
                        board[r][c] = 3;
                    } else if (liveNeighbours > 3) {
                        // dies from over-population:
                        board[r][c] = 3;
                    }
                } else if (board[r][c] == 0) {
                    // dead cells:
                    if (liveNeighbours == 3) {
                        // becomes live from reproduction:
                        board[r][c] = 2;
                    }
                }
            }
        }

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == 2) board[r][c] = 1;
                if (board[r][c] == 3) board[r][c] = 0;
            }
        }
    }

    private int countLiveNeighbours(int i, int j, int[][] board) {
        int count = 0;

        for (int r = i - 1; r <= i + 1; r++) {
            for (int c = j - 1; c <= j + 1; c++) {
                if (r >= 0 && r < board.length && c >= 0 && c < board[0].length && (r != i || c != j)) {
                    if (board[r][c] == 1 || board[r][c] == 3) count++;
                }
            }
        }

        return count;
    }
}
