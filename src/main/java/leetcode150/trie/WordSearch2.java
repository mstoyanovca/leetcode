package leetcode150.trie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearch2 {
    public List<String> findWords(char[][] board, String[] words) {
        int m = board.length;
        int n = board[0].length;
        TrieNode root = buildTrie(words);
        Set<String> result = new HashSet<>();

        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) dfs(i, j, root, board, result);

        return result.stream().toList();
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();

        for (String word : words) {
            TrieNode current = root;

            for (char c : word.toCharArray()) {
                current.children.putIfAbsent(c, new TrieNode());
                current = current.children.get(c);
            }

            current.word = word;
        }

        return root;
    }

    private void dfs(int i, int j, TrieNode root, char[][] board, Set<String> result) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] == '#') return;
        if (root.children.get(board[i][j]) == null || board[i][j] == '#') return;

        root = root.children.get(board[i][j]);
        if (root.word != null) result.add(root.word);

        char original = board[i][j];
        board[i][j] = '#';

        dfs(i - 1, j, root, board, result);
        dfs(i + 1, j, root, board, result);
        dfs(i, j - 1, root, board, result);
        dfs(i, j + 1, root, board, result);

        board[i][j] = original;
    }
}
