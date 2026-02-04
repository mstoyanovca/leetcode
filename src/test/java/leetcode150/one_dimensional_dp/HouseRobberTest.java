package leetcode150.one_dimensional_dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberTest {
    @Test
    public void example1Test() {
        assertEquals(4, new HouseRobber().rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void example2Test() {
        assertEquals(12, new HouseRobber().rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    public void example3Test() {
        assertEquals(4, new HouseRobber().rob(new int[]{2, 1, 1, 2}));
    }
}
