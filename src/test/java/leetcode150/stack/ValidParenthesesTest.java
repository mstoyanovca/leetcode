package leetcode150.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {
    @Test
    public void example1Test() {
        assertTrue(new ValidParentheses().isValid("()"));
    }

    @Test
    public void example2Test() {
        assertTrue(new ValidParentheses().isValid("()[]{}"));
    }

    @Test
    public void example3Test() {
        assertFalse(new ValidParentheses().isValid("(]"));
    }

    @Test
    public void example4Test() {
        assertTrue(new ValidParentheses().isValid("([])"));
    }

    @Test
    public void example5Test() {
        assertFalse(new ValidParentheses().isValid("([)]"));
    }
}
