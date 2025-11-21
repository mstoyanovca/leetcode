package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JumpGameTest {
    @Test
    public void example1Test() {
        assertTrue(new JumpGame().canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void example2Test() {
        assertFalse(new JumpGame().canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    public void example3Test() {
        assertFalse(new JumpGame().canJump(new int[]{0, 1}));
    }

    @Test
    public void example4Test() {
        assertTrue(new JumpGame().canJump(new int[]{0}));
    }
}
