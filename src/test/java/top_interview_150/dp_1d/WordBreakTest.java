package top_interview_150.dp_1d;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordBreakTest {
    @Test
    public void example1Test() {
        assertTrue(new WordBreak().wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test
    public void example2Test() {
        assertTrue(new WordBreak().wordBreak("applepenapple", List.of("apple", "pen")));
    }

    @Test
    public void example3Test() {
        assertFalse(new WordBreak().wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    public void example4Test() {
        assertTrue(new WordBreak().wordBreak("cars", List.of("car", "ca", "rs")));
    }

    @Test
    public void example5Test() {
        assertTrue(new WordBreak().wordBreak("aaaaaaa", List.of("aaaa", "aaa")));
    }
}
