package top_interview_150.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowXNTest {
    @Test
    public void example1Test() {
        assertEquals(1024.0, new PowXN().myPow(2.0, 10));
    }

    @Test
    public void example2Test() {
        assertEquals(9.261, new PowXN().myPow(2.1, 3));
    }

    @Test
    public void example3Test() {
        assertEquals(0.25, new PowXN().myPow(2.0, -2));
    }

    @Test
    public void example4Test() {
        assertEquals(1.0, new PowXN().myPow(1.0, -2147483648));
    }
}
