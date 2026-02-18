package top_interview_150.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {
    @Test
    public void example1Test() {
        assertEquals(49, new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new ContainerWithMostWater().maxArea(new int[]{1, 1}));
    }
}
