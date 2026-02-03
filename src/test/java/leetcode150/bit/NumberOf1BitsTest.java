package leetcode150.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {
    @Test
    public void example1Test() {
        assertEquals(3, new NumberOf1Bits().hammingWeight(11));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new NumberOf1Bits().hammingWeight(128));
    }

    @Test
    public void example3Test() {
        assertEquals(30, new NumberOf1Bits().hammingWeight(2147483645));
    }
}
