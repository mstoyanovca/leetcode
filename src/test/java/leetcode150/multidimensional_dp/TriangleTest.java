package leetcode150.multidimensional_dp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    public void example1Test() {
        assertEquals(11, new Triangle().minimumTotal(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3))));
    }

    @Test
    public void example2Test() {
        assertEquals(-10, new Triangle().minimumTotal(List.of(List.of(-10))));
    }

    @Test
    public void example3Test() {
        assertEquals(-1, new Triangle().minimumTotal(List.of(List.of(-1), List.of(2, 3), List.of(1, -1, -3))));
    }
}
