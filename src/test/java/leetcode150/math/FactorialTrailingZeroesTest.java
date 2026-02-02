package leetcode150.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTrailingZeroesTest {
    @Test
    public void example1Test() {
        assertEquals(0, new FactorialTrailingZeroes().trailingZeroes(3));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new FactorialTrailingZeroes().trailingZeroes(5));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new FactorialTrailingZeroes().trailingZeroes(0));
    }
}
