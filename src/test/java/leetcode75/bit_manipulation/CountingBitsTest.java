package leetcode75.bit_manipulation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountingBitsTest {
    private final CountingBits countingBits = new CountingBits();

    @Test
    void example1() {
        assertTrue(Arrays.equals(new int[]{0, 1, 1}, countingBits.countBits(2)));
    }

    @Test
    void example2() {
        assertTrue(Arrays.equals(new int[]{0, 1, 1, 2, 1, 2}, countingBits.countBits(5)));
    }
}
