package leetcode75.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreatestCommonDivisorOfStringsTest {
    private final GreatestCommonDivisorOfStrings greatestCommonDivisor = new GreatestCommonDivisorOfStrings();

    @Test
    void example1() {
        assertEquals("ABC", greatestCommonDivisor.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    void example2() {
        assertEquals("AB", greatestCommonDivisor.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    void example3() {
        assertEquals("", greatestCommonDivisor.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    void example4() {
        assertEquals("TAUXX", greatestCommonDivisor.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}
