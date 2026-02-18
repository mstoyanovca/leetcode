package leet_code_75.queue;

import java.util.LinkedList;
import java.util.Queue;

// problem 27:
public class NumberOfRecentCalls {
    static class RecentCounter {
        // read this from config:
        private static final int RANGE = 3000;
        private final Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
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
