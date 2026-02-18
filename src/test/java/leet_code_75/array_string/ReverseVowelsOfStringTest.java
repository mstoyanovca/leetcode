package leet_code_75.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsOfStringTest {
    private final ReverseVowelsOfString reverseVowels = new ReverseVowelsOfString();

    @Test
    void example1() {
        assertEquals("AceCreIm", reverseVowels.reverseVowels("IceCreAm"));
    }

    @Test
    void example2() {
        assertEquals("leotcede", reverseVowels.reverseVowels("leetcode"));
    }
}
