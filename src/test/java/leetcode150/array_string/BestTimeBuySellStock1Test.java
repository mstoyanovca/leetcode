package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeBuySellStock1Test {
    @Test
    public void example1Test() {
        assertEquals(5, new BestTimeBuySellStock1().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void example2Test() {
        assertEquals(0, new BestTimeBuySellStock1().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
