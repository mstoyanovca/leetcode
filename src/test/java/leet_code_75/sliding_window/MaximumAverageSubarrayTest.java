package leet_code_75.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumAverageSubarrayTest {
    private final MaximumAverageSubarray maximumAverage = new MaximumAverageSubarray();

    @Test
    void example1() {
        assertEquals(12.75000, maximumAverage.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    @Test
    void example2() {
        assertEquals(5.0000, maximumAverage.findMaxAverage(new int[]{5}, 1));
    }

    @Test
    void example3() {
        assertEquals(-1.00000, maximumAverage.findMaxAverage(new int[]{-1}, 1));
    }
}
