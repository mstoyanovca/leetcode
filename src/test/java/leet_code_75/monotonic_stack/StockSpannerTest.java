package leet_code_75.monotonic_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockSpannerTest {
    @Test
    void example1() {
        StockSpanner stockSpanner = new StockSpanner();
        assertEquals(1, stockSpanner.next(100));
        assertEquals(1, stockSpanner.next(80));
        assertEquals(1, stockSpanner.next(60));
        assertEquals(2, stockSpanner.next(70));
        assertEquals(1, stockSpanner.next(60));
        assertEquals(4, stockSpanner.next(75));
        assertEquals(6, stockSpanner.next(85));
    }
}
