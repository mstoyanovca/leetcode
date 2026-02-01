package leetcode150.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {
    @Test
    public void example1Test() {
        assertTrue(new PalindromeNumber().isPalindrome(121));
    }

    @Test
    public void example2Test() {
        assertFalse(new PalindromeNumber().isPalindrome(-121));
    }

    @Test
    public void example3Test() {
        assertFalse(new PalindromeNumber().isPalindrome(10));
    }
}
