package top_interview_150.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubsequenceTest {
    @Test
    public void example1Test() {
        assertTrue(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void example2Test() {
        assertFalse(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void example3Test() {
        assertFalse(new IsSubsequence().isSubsequence("abc", ""));
    }

    @Test
    public void example4Test() {
        assertFalse(new IsSubsequence().isSubsequence("acb", "ahbgdc"));
    }
}
