package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {
    @Test
    public void example1Test() {
        assertEquals(3, new RomanToInteger().romanToInt("III"));
    }

    @Test
    public void example2Test() {
        assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
    }

    @Test
    public void example3Test() {
        assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
    }
}
