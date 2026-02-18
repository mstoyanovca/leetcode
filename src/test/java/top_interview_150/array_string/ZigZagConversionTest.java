package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigZagConversionTest {
    @Test
    public void example1Test() {
        /*
        * 0     6       12
        * 1   5 7    11 13
        * 2 4   8 10    14
        * 3     9       15
        *
        * for indexes 0 - 2 and 6 - 8,
        * jumping to the next element within a row increases the index by 2 * (rows - row - 1)
        * for indexes 3 - 5 and 9 - 11, the formula is: 2 * (rows - (rows - row - 1) - 1)
        * for 3 - 5 and 9 - 11 we want to count the rows backwards, i.e. 0, 1, 2
        * row becomes i % (rows - 1)
        * from here the generic formula:
        * i += 2 * (rows - i % (rows - 1) - 1)
        * */
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
