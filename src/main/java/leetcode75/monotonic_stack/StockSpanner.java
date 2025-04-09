package leetcode75.monotonic_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanner {
    private final Deque<Integer> stack;

    public StockSpanner() {
        stack = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 0;
        boolean foundHigherPrice = false;

        stack.push(price);
        int size = stack.size();

        for (int i = 0; i < size; i++) {
            int p = stack.pop();
            if (!foundHigherPrice && price >= p) {
                span++;
            } else {
                foundHigherPrice = true;
            }
            stack.add(p);
        }

        return span;
    }
}
