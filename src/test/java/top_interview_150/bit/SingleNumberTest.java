package top_interview_150.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {
    @Test
    public void example1Test() {
        assertEquals(1, new SingleNumber().singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    public void example2Test() {
        assertEquals(4, new SingleNumber().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    public void example3Test() {
        assertEquals(1, new SingleNumber().singleNumber(new int[]{1}));
    }

    @Test
    public void example4Test() {
        assertEquals(0, new SingleNumber().singleNumber(new int[]{3, 3}));
    }
}
