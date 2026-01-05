package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyTest {
    @Test
    public void example1Test() {
        assertEquals(5, new Candy().candy(new int[]{1, 0, 2}));
    }

    @Test
    public void example2Test() {
        assertEquals(4, new Candy().candy(new int[]{1, 2, 2}));
    }

    @Test
    public void example3Test() {
        assertEquals(7, new Candy().candy(new int[]{1, 3, 2, 2, 1}));
    }

    @Test
    public void example4Test() {
        assertEquals(13, new Candy().candy(new int[]{1, 2, 87, 87, 87, 2, 1}));
    }

    @Test
    public void example5Test() {
        assertEquals(12, new Candy().candy(new int[]{29, 51, 87, 87, 72, 12}));
    }

    @Test
    public void example6Test() {
        assertEquals(11, new Candy().candy(new int[]{1,3,4,5,2}));
    }
}
