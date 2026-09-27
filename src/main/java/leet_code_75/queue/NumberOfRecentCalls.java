package leet_code_75.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfRecentCalls {
    static class RecentCounter {
        private static final int RANGE = 3000;
        private final Queue<Integer> queue;

        public RecentCounter() {
            queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            queue.add(t);

            while (!queue.isEmpty() && queue.element() < t - RANGE) {
                queue.remove();
            }

            return queue.size();
        }
    }
}
