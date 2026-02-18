package top_interview_150.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTest {
    @Test
    public void example1Test() {
        Trie trie = new Trie();
        trie.insert("apple");

        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));

        trie.insert("app");
        assertTrue(trie.search("app"));
    }

    @Test
    public void example2Test() {
        Trie trie = new Trie();
        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");

        assertTrue(trie.startsWith("rent"));
    }
}
