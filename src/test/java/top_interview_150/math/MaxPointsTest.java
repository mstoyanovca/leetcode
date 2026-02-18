package top_interview_150.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxPointsTest {
    @Test
    public void example1Test() {
        assertEquals(3, new MaxPoints().maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }

    @Test
    public void example2Test() {
        assertEquals(4, new MaxPoints().maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
    }
}
