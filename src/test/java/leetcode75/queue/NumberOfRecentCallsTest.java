package leetcode75.queue;

import org.junit.jupiter.api.Test;

import static leetcode75.queue.NumberOfRecentCalls.RecentCounter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfRecentCallsTest {
    @Test
    void example1() {
        RecentCounter counter = new RecentCounter();
        assertEquals(1, counter.ping(1));
        assertEquals(2, counter.ping(100));
        assertEquals(3, counter.ping(3001));
        assertEquals(3, counter.ping(3002));
    }
}
