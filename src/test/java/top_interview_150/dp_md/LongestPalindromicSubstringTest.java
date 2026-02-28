package top_interview_150.dp_md;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {
    @Test
    public void example1Test() {
        assertEquals("bab", new LongestPalindromicSubstring().longestPalindrome("babad"));
    }

    @Test
    public void example2Test() {
        assertEquals("bb", new LongestPalindromicSubstring().longestPalindrome("cbbd"));
    }
}
