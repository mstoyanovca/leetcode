package leet_code_75.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfVowelsInSubstringTest {
    private final MaxNumberOfVowelsInSubstring maxNumberOfVowels = new MaxNumberOfVowelsInSubstring();

    @Test
    void example1() {
        assertEquals(3, maxNumberOfVowels.maxVowels("abciiidef", 3));
    }

    @Test
    void example2() {
        assertEquals(2, maxNumberOfVowels.maxVowels("aeiou", 2));
    }

    @Test
    void example3() {
        assertEquals(2, maxNumberOfVowels.maxVowels("leetcode", 3));
    }

    @Test
    void example4() {
        assertEquals(1, maxNumberOfVowels.maxVowels("tryhard", 4));
    }
}
