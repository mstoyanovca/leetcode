package leetcode150.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void example1Test() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void example3Test() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void example4Test() {
        assertEquals(3, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("dvdf"));
    }
}
