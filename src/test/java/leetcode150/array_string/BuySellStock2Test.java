package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuySellStock2Test {
    @Test
    public void example1Test() {
        assertEquals(7, new BuySellStock2().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
