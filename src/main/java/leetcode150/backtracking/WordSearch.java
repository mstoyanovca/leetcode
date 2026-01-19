package leetcode150.backtracking;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(0, 0, board, "", word)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean backtrack(int i, int j, char[][] board, String current, String word) {
        if (i < 0 || i > board.length || j < 0 || j > board[0].length) return false;
        if (current.equals(word)) return true;

        boolean left = backtrack(i, j - 1, board, current, word);
        boolean right = backtrack(i, j + 1, board, current, word);
        boolean top = backtrack(i - 1, j, board, current, word);
        boolean bottom = backtrack(i + 1, j, board, current, word);

        return left || right || top || bottom;
    }
}
