package top_interview_150.multidimensional_dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditDistanceTest {
    @Test
    public void example1Test() {
        assertEquals(3, new EditDistance().minDistance("horse", "ros"));
    }

    @Test
    public void example2Test() {
        assertEquals(5, new EditDistance().minDistance("intention", "execution"));
    }
}
