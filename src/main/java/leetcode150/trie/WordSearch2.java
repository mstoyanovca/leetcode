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
            // add the first character as a child to the root of the trie:
            char firstCharacter = word.charAt(0);
            root.children.putIfAbsent(firstCharacter, new TrieNode());
            // iterate over each character of the board:
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // if it matches the first character of the word:
                    if (firstCharacter == board[i][j]) {
                        // populate the child node subtree:
                        boolean[][] visited = new boolean[m][n];
                        dfs(i, j, root.children.get(firstCharacter), visited, board);
                        int x = 0;
                    }
                }
            }

        }

        return result;
    }

    private void dfs(int i, int j, TrieNode current, boolean[][] visited, char[][] board) {
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1 || visited[i][j]) return;

        current.children.computeIfAbsent(board[i][j], _ -> new TrieNode());
        visited[i][j] = true;

        dfs(i - 1, j, current, visited, board);
        dfs(i + 1, j, current, visited, board);
        dfs(i, j - 1, current, visited, board);
        dfs(i, j + 1, current, visited, board);
    }
}
