package leetcode150.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private final Map<String, String> map;

    public Trie() {
        map = new HashMap<>();
    }

    public void insert(String word) {
        map.put(word, word);
    }

    public boolean search(String word) {
        return map.containsKey(word);
    }

    public boolean startsWith(String prefix) {
        return map.keySet().stream().map(k -> k.startsWith(prefix)).filter(k -> k).findFirst().orElse(false);
    }
}
