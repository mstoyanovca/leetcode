package top_interview_150.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitwiseAndOfNumberRangeTest {
    @Test
    public void example1Test() {
        assertEquals(4, new BitwiseAndOfNumberRange().rangeBitwiseAnd(5, 7));
    }

    @Test
    public void example2Test() {
        assertEquals(0, new BitwiseAndOfNumberRange().rangeBitwiseAnd(0, 0));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new BitwiseAndOfNumberRange().rangeBitwiseAnd(1, 2147483647));
    }
}
