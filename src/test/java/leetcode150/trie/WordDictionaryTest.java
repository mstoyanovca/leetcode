package leetcode150.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordDictionaryTest {
    @Test
    public void example1Test() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertFalse(new WordDictionary().search("pad"));
        assertTrue(new WordDictionary().search("bad"));
        // assertTrue(new WordDictionary().search(".ad"));
        // assertTrue(new WordDictionary().search("b.."));
    }
}
