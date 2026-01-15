package leetcode150.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {
    private final List<String> list;

    public Trie() {
        list = new ArrayList<>();
    }

    public void insert(String word) {
        list.add(word);
    }

    public boolean search(String word) {
        return list.contains(word);
    }

    public boolean startsWith(String prefix) {
        return list.stream().anyMatch(s -> s.startsWith(prefix));
    }
}
