package leetcode150.multidimensional_dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTImeBuySellStock4Test {
    @Test
    public void example1Test() {
        assertEquals(2, new BestTImeBuySellStock4().maxProfit(2, new int[]{2, 4, 1}));
    }

    @Test
    public void example2Test() {
        assertEquals(7, new BestTImeBuySellStock4().maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
    }
}
