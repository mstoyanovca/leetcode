package top_interview_150.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceTest {
    @Test
    public void example1Test() {
        assertEquals(4, new LongestConsecutiveSequence().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    @Test
    public void example2Test() {
        assertEquals(9, new LongestConsecutiveSequence().longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    public void example3Test() {
        assertEquals(3, new LongestConsecutiveSequence().longestConsecutive(new int[]{1, 0, 1, 2}));
    }

    @Test
    public void example4Test() {
        assertEquals(0, new LongestConsecutiveSequence().longestConsecutive(new int[]{}));
    }
}
