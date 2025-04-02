package leetcode75.dp_1d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TribonacciNumberTest {
    private final TribonacciNumber tribonacciNumber = new TribonacciNumber();

    @Test
    void example1() {
        assertEquals(4, tribonacciNumber.tribonacci(4));
    }

    @Test
    void example2() {
        assertEquals(1389537, tribonacciNumber.tribonacci(25));
    }
}
