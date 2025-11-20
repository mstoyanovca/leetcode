package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuySellStock1Test {
    @Test
    public void example1Test() {
        assertEquals(5, new BuySellStock1().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
