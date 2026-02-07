package leetcode150.one_dimensional_dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestIncreasingSubsequenceTest {
    @Test
    public void example1Test() {
        assertEquals(4, new LongestIncreaisngSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    public void example2Test() {
        assertEquals(4, new LongestIncreaisngSubsequence().lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }

    @Test
    public void example3Test() {
        assertEquals(1, new LongestIncreaisngSubsequence().lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}
