package leetcode150.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {
    @Test
    public void example1Test() {
        assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void example2Test() {
        assertTrue(new ValidPalindrome().isPalindrome("race a car"));
    }

    @Test
    public void example3Test() {
        assertTrue(new ValidPalindrome().isPalindrome(" "));
    }
}
