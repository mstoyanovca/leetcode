package leetcode75.bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {
    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    void example1() {
        assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void example2() {
        assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    void example3() {
        assertEquals(1, singleNumber.singleNumber(new int[]{1}));
    }
}
