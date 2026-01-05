package leetcode150.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordPatternTest {
    @Test
    public void example1Test() {
        assertTrue(new WordPattern().wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void example2Test() {
        assertFalse(new WordPattern().wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    public void example3Test() {
        assertFalse(new WordPattern().wordPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    public void example4Test() {
        assertFalse(new WordPattern().wordPattern("aaa", "aa aa aa aa"));
    }
}
