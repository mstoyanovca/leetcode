package leet_code_75.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {
    private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    void example1() {
        assertEquals(49, containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void example2() {
        assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 1}));
    }

    @Test
    void example3() {
        assertEquals(4, containerWithMostWater.maxArea(new int[]{1, 2, 4, 3}));
    }
}
