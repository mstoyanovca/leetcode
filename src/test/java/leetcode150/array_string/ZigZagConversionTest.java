package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigZagConversionTest {
    @Test
    public void example1Test() {
        assertEquals("PAHNAPLSIIGYIR", new ZigZagConversion().convert("PAYPALISHIRING", 3));
    }

    @Test
    public void example2Test() {
        assertEquals("PINALSIGYAHRPI", new ZigZagConversion().convert("PAYPALISHIRING", 4));
    }

    @Test
    public void example3Test() {
        assertEquals("A", new ZigZagConversion().convert("A", 1));
    }

    @Test
    public void example4Test() {
        assertEquals("AB", new ZigZagConversion().convert("AB", 1));
    }

    @Test
    public void example5Test() {
        assertEquals("AB", new ZigZagConversion().convert("AB", 4));
    }
}
