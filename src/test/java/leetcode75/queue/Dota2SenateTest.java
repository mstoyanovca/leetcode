package leetcode75.queue;

import org.junit.jupiter.api.Test;

import static leetcode75.queue.Dota2Senate.DIRE;
import static leetcode75.queue.Dota2Senate.RADIANT;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dota2SenateTest {
    private final Dota2Senate senate = new Dota2Senate();

    @Test
    void example1() {
        assertEquals(RADIANT, senate.predictPartyVictory("RD"));
    }

    @Test
    void example2() {
        assertEquals(DIRE, senate.predictPartyVictory("RDD"));
    }
}
