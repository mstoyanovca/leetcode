package leetcode150.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtXTest {
    @Test
    public void example1Test() {
        assertEquals(2, new SqrtX().mySqrt(4));
    }

    @Test
    public void example2Test() {
        assertEquals(2, new SqrtX().mySqrt(8));
    }

    @Test
    public void example3Test() {
        assertEquals(46339, new SqrtX().mySqrt(2147395599));
    }
}
