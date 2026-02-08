package leetcode150.multidimensional_dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTImeBuySellStock3Test {
    @Test
    public void example1Test() {
        assertEquals(6, new BestTImeBuySellStock3().maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }

    @Test
    public void example2Test() {
        assertEquals(4, new BestTImeBuySellStock3().maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new BestTImeBuySellStock3().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
