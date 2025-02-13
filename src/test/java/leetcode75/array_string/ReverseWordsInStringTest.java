package leetcode75.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInStringTest {
    private final ReverseWordsInString reverseWordsInString = new ReverseWordsInString();

    @Test
    void example1() {
        assertEquals("blue is sky the", reverseWordsInString.reverseWords("the sky is blue"));
    }

    @Test
    void example2() {
        assertEquals("world hello", reverseWordsInString.reverseWords("  hello world  "));
    }

    @Test
    void example3() {
        assertEquals("example good a", reverseWordsInString.reverseWords("a good   example"));
    }
}
