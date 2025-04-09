package leetcode75.monotonic_stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StockSpanner {
    private final Deque<Integer> stack;

    public StockSpanner() {
        stack = new ArrayDeque<>();
    }

    public int next(int price) {
        stack.push(price);
        int span = 0;
        List<Integer> prices = new ArrayList<>();
        int size = stack.size();
        boolean keepGoing = true;

        for (int i = 0; i < size; i++) {
            int p = stack.pop();
            prices.add(p);
            if (keepGoing && price >= p) {
                span++;
            } else {
                keepGoing = false;
            }
        }

        stack.addAll(prices);

        return span;
    }
}
