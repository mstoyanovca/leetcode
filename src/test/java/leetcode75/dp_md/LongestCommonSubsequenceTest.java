package leetcode75.dp_md;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceTest {
    private final LongestCommonSubsequence longestSubsequence = new LongestCommonSubsequence();

    @Test
    void example1() {
        assertEquals(3, longestSubsequence.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void example2() {
        assertEquals(3, longestSubsequence.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void example3() {
        assertEquals(0, longestSubsequence.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void example4() {
        assertEquals(210, longestSubsequence.longestCommonSubsequence("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    void example5() {
        assertEquals(2, longestSubsequence.longestCommonSubsequence("aaa", "aa"));
    }
}
