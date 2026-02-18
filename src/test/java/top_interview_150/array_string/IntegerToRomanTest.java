package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void example1Test() {
        assertEquals("MMMDCCXLIX", new IntegerToRoman().intToRoman(3749));
    }

    @Test
    public void example2Test() {
        assertEquals("LVIII", new IntegerToRoman().intToRoman(58));
    }

    @Test
    public void example3Test() {
        assertEquals("MCMXCIV", new IntegerToRoman().intToRoman(1994));
    }
}
