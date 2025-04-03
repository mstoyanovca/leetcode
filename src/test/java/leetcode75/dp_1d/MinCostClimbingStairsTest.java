package leetcode75.dp_1d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostClimbingStairsTest {
    private final MinCostClimbingStairs minCost = new MinCostClimbingStairs();

    @Test
    void example1() {
        assertEquals(15, minCost.minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    void example2() {
        assertEquals(6, minCost.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
