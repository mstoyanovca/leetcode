package leetcode75.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayOf1sAfterDeletingOneElementTest {
    private final LongestSubarrayOf1sAfterDeletingOneElement longestSubarray = new LongestSubarrayOf1sAfterDeletingOneElement();

    @Test
    void example1() {
        assertEquals(3, longestSubarray.longestSubarray(new int[]{1, 1, 0, 1}));
    }

    @Test
    void example2() {
        assertEquals(5, longestSubarray.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
    }

    @Test
    void example3() {
        assertEquals(2, longestSubarray.longestSubarray(new int[]{1, 1, 1}));
    }
}
