package leetcode150.kadane;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {
    @Test
    public void example1Test() {
        assertEquals(6, new MaximumSubarray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new MaximumSubarray().maxSubArray(new int[]{1}));
    }

    @Test
    public void example3Test() {
        assertEquals(23, new MaximumSubarray().maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
