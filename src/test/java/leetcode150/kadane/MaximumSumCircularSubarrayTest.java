package leetcode150.kadane;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumCircularSubarrayTest {
    @Test
    public void example1Test() {
        assertEquals(3, new MaximumSumCircularSubarray().maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
    }

    @Test
    public void example2Test() {
        assertEquals(10, new MaximumSumCircularSubarray().maxSubarraySumCircular(new int[]{5, -3, 5}));
    }

    @Test
    public void example3Test() {
        assertEquals(-2, new MaximumSumCircularSubarray().maxSubarraySumCircular(new int[]{-3, -2, -3}));
    }

    @Test
    public void example4Test() {
        assertEquals(13, new MaximumSumCircularSubarray().maxSubarraySumCircular(new int[]{1, 2, 5, -2, -3, 5}));
    }
}
