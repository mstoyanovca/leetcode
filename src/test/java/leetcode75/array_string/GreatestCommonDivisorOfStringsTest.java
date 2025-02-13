package leetcode75.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorOfStringsTest {
    private final GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();

    @Test
    void example1() {
        assertEquals("ABC", greatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    void example2() {
        assertEquals("AB", greatestCommonDivisorOfStrings.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    void example3() {
        assertEquals("", greatestCommonDivisorOfStrings.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    void example4() {
        assertEquals("TAUXX", greatestCommonDivisorOfStrings.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}
