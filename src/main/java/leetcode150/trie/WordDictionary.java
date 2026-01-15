package leetcode150.trie;

import java.util.ArrayList;
import java.util.List;

public class WordDictionary {
    private final List<String> list;

    public WordDictionary() {
        list = new ArrayList<>();
    }

    public void addWord(String word) {
        list.add(word);
    }

    public boolean search(String word) {
        return list.contains(word);
    }
}
