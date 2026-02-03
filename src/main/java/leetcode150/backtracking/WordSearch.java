package leetcode150.backtracking;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(i, j, board, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean backtrack(int i, int j, char[][] board, int index, String word) {
        if (index == word.length()) return true;
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] == '#' || board[i][j] != word.charAt(index)) return false;

        if (board[i][j] == word.charAt(index)) index++;
        char original = board[i][j];
        board[i][j] = '#';

        boolean left = backtrack(i, j - 1, board, index, word);
        boolean right = backtrack(i, j + 1, board, index, word);
        boolean top = backtrack(i - 1, j, board, index, word);
        boolean bottom = backtrack(i + 1, j, board, index, word);

        board[i][j] = original;

        return left || right || top || bottom;
    }
}
