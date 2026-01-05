package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {
    @Test
    public void example1Test() {
        assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void example2Test() {
        assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
