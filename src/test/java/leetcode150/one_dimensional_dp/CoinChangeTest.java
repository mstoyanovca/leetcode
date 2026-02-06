package leetcode150.one_dimensional_dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {
    @Test
    public void example1Test() {
        assertEquals(3, new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void example2Test() {
        assertEquals(-1, new CoinChange().coinChange(new int[]{2}, 3));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new CoinChange().coinChange(new int[]{1}, 0));
    }
}
