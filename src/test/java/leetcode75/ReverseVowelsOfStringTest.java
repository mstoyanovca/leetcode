package leetcode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsOfStringTest {
    ReverseVowelsOfString reverseVowelsOfString = new ReverseVowelsOfString();

    @Test
    void example1() {
        assertEquals("AceCreIm", reverseVowelsOfString.reverseVowels("IceCreAm"));
    }

    @Test
    void example2() {
        assertEquals("leotcede", reverseVowelsOfString.reverseVowels("leetcode"));
    }
}
