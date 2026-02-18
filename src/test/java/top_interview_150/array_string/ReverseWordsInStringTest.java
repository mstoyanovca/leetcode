package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInStringTest {
    @Test
    public void example1Test() {
        assertEquals("blue is sky the", new ReverseWordsInString().reverseWords("the sky is blue"));
    }

    @Test
    public void example2Test() {
        assertEquals("world hello", new ReverseWordsInString().reverseWords("  hello world  "));
    }

    @Test
    public void example3Test() {
        assertEquals("example good a", new ReverseWordsInString().reverseWords("a good   example"));
    }
}
