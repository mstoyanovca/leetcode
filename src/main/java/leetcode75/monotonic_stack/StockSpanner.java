package leetcode75.monotonic_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanner {
    private final Deque<Integer> prices;

    public StockSpanner() {
        prices = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 0;
        prices.push(price);

        for (int p : prices) {
            if (price >= p) {
                span++;
            } else {
                break;
            }
        }

        return span;
    }
}
