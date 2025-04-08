package leetcode75.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImplementTrieTest {
    @Test
    void example1() {
        Trie trie = new Trie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));
        trie.insert("app");
        assertTrue(trie.search("app"));
    }

    @Test
    void example2() {
        Trie trie = new Trie();
        trie.insert("hotdog");
        assertFalse(trie.startsWith("dog"));
    }

    @Test
    void example3() {
        Trie trie = new Trie();
        trie.insert("ab");
        trie.insert("abc");
        assertTrue(trie.startsWith("abc"));
    }
}
