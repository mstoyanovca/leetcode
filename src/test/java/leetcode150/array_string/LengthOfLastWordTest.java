package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordTest {
    @Test
    public void example1Test() {
        assertEquals(5, new LengthOfLastWord().lengthOfLastWord("Hello World"));
    }

    @Test
    public void example2Test() {
        assertEquals(4, new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    public void example3Test() {
        assertEquals(6, new LengthOfLastWord().lengthOfLastWord("luffy is still joyboy"));
    }
}
