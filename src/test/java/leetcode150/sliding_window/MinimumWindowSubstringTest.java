package leetcode150.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumWindowSubstringTest {
    @Test
    public void example1Test() {
        assertEquals("BANC", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void example2Test() {
        assertEquals("a", new MinimumWindowSubstring().minWindow("a", "a"));
    }

    @Test
    public void example3Test() {
        assertEquals("", new MinimumWindowSubstring().minWindow("a", "aa"));
    }
}
