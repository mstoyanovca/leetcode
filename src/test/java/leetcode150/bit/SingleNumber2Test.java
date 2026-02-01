package leetcode150.bit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumber2Test {
    @Test
    public void example1Test() {
        assertEquals(3, new SingleNumber2().singleNumber(new int[]{2, 2, 3, 2}));
    }

    @Test
    public void example2Test() {
        assertEquals(99, new SingleNumber2().singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }
}
