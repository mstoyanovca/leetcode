package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpGame2Test {
    @Test
    public void example1Test() {
        assertEquals(2, new JumpGame2().jump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new JumpGame2().jump(new int[]{1, 2}));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new JumpGame2().jump(new int[]{0}));
    }

    @Test
    public void example4Test() {
        assertEquals(3, new JumpGame2().jump(new int[]{1, 1, 1, 1}));
    }
}
