package top_interview_150.dp_1d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
    @Test
    public void example1Test() {
        assertEquals(2, new ClimbingStairs().climbStairs(2));
    }

    @Test
    public void example2Test() {
        assertEquals(3, new ClimbingStairs().climbStairs(3));
    }
}
