package leet_code_75.dp_md;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellTest {
    private final BestTimeToBuyAndSell bestTimeToBuyAndSell = new BestTimeToBuyAndSell();

    @Test
    void example1() {
        assertEquals(8, bestTimeToBuyAndSell.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }

    @Test
    void example2() {
        assertEquals(6, bestTimeToBuyAndSell.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }
}
