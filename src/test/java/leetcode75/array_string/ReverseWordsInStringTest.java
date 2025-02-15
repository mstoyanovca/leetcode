package leetcode75.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInStringTest {
    private final ReverseWordsInString reverseWords = new ReverseWordsInString();

    @Test
    void example1() {
        assertEquals("blue is sky the", reverseWords.reverseWords("the sky is blue"));
    }

    @Test
    void example2() {
        assertEquals("world hello", reverseWords.reverseWords("  hello world  "));
    }

    @Test
    void example3() {
        assertEquals("example good a", reverseWords.reverseWords("a good   example"));
    }
}
