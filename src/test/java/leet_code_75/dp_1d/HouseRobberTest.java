package leet_code_75.dp_1d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberTest {
    private final HouseRobber robber = new HouseRobber();

    @Test
    void example1() {
        assertEquals(4, robber.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void example2() {
        assertEquals(12, robber.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    void example3() {
        assertEquals(0, robber.rob(new int[]{0}));
    }

    @Test
    void example4() {
        assertEquals(4, robber.rob(new int[]{2, 1, 1, 2}));
    }
}
