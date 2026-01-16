package leetcode150.trie;

import java.util.ArrayList;
import java.util.List;

public class WordSearch2 {
    public List<String> findWords(char[][] board, String[] words) {
        int m = board.length;
        int n = board[0].length;
        TrieNode root = new TrieNode();
        List<String> result = new ArrayList<>();

        // for each word:
        for (String word : words) {
            // iterate over each character of the board:
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // if it matches the first character of the word:
                    if (word.charAt(0) == board[i][j]) {
                        boolean[][] visited = new boolean[m][n];
                        visited[i][j] = true;
                        // create a trie:
                        createTrie(i, j, board, root, visited);
                    }
                }
            }

        }

        return result;
    }

    private void createTrie(int i, int j, char[][] board, TrieNode root, boolean[][] visited) {
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1) return;


    }
}
