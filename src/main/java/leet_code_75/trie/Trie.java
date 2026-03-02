package leet_code_75.trie;

// problem 70:
// a trie, or prefix tree, is a tree data structure used to efficiently store and retrieve keys in a dataset of strings;
// there are various applications of this data structure, such as autocomplete and spellchecker;
class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) node = node.children.computeIfAbsent(c, k -> new TrieNode());
        node.isEow = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node = node.children.get(c);
            if (node == null) return false;
        }
        return node.isEow;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            node = node.children.get(c);
            if (node == null) return false;
        }
        return true;
    }
}
