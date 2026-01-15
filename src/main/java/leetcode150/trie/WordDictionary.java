package leetcode150.trie;

public class WordDictionary {
    private final TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) current = current.children.computeIfAbsent(c, _ -> new TrieNode());
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') for (char child : current.children.keySet()) return search(word.substring(0, i) + child + word.substring(i + 1));
            current = current.children.get(c);
            if (current == null) return false;
        }

        return current.isEndOfWord;
    }
}
