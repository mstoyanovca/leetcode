package leetcode150.backtracking;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(0, 0, board, "", word)) return true;
            }
        }
        return false;
    }

    private boolean backtrack(int i, int j, char[][] board, String current, String word) {
        return false;
    }
}
