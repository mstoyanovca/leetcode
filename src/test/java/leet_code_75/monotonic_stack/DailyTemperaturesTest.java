package leet_code_75.monotonic_stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DailyTemperaturesTest {
    private final DailyTemperatures dailyTemperatures = new DailyTemperatures();

    @Test
    void example1() {
        assertTrue(Arrays.equals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    @Test
    void example2() {
        assertTrue(Arrays.equals(new int[]{1, 1, 1, 0}, dailyTemperatures.dailyTemperatures(new int[]{30, 40, 50, 60})));
    }

    @Test
    void example3() {
        assertTrue(Arrays.equals(new int[]{1, 1, 0}, dailyTemperatures.dailyTemperatures(new int[]{30, 60, 90})));
    }
}
