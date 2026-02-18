package top_interview_150.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {
    @Test
    public void example1Test() {
        assertEquals("100", new AddBinary().addBinary("11", "1"));
    }

    @Test
    public void example2Test() {
        assertEquals("10101", new AddBinary().addBinary("1010", "1011"));
    }
}
