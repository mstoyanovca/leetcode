package leetcode75.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfVowelsInSubstringOfGivenLengthTest {
    private final MaxNumberOfVowelsInSubstringOfGivenLength maxNumberOfVowelsInSubstringOfGivenLength = new MaxNumberOfVowelsInSubstringOfGivenLength();

    @Test
    void example1() {
        assertEquals(3, maxNumberOfVowelsInSubstringOfGivenLength.maxVowels("abciiidef", 3));
    }

    @Test
    void example2() {
        assertEquals(2, maxNumberOfVowelsInSubstringOfGivenLength.maxVowels("aeiou", 2));
    }

    @Test
    void example3() {
        assertEquals(2, maxNumberOfVowelsInSubstringOfGivenLength.maxVowels("leetcode", 3));
    }

    @Test
    void example4() {
        assertEquals(1, maxNumberOfVowelsInSubstringOfGivenLength.maxVowels("tryhard", 4));
    }
}
