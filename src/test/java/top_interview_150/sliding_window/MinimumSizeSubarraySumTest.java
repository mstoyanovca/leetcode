package top_interview_150.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSizeSubarraySumTest {
    @Test
    public void example1Test() {
        assertEquals(2, new MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new MinimumSizeSubarraySum().minSubArrayLen(4, new int[]{1, 4, 4}));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new MinimumSizeSubarraySum().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }
}
