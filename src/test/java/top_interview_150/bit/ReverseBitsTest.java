package top_interview_150.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitsTest {
    @Test
    public void example1Test() {
        assertEquals(964176192, new ReverseBits().reverseBits(43261596));
    }

    @Test
    public void example2Test() {
        assertEquals(1073741822, new ReverseBits().reverseBits(2147483644));
    }
}
