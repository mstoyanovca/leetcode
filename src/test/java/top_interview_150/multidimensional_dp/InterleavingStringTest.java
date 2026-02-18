package top_interview_150.multidimensional_dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterleavingStringTest {
    @Test
    public void example1Test() {
        assertTrue(new InterleavingString().isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void example2Test() {
        assertFalse(new InterleavingString().isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    public void example3Test() {
        assertTrue(new InterleavingString().isInterleave("", "", ""));
    }

    @Test
    public void example4Test() {
        assertTrue(new InterleavingString().isInterleave("", "b", "b"));
    }
}
