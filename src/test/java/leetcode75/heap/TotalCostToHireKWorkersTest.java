package leetcode75.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalCostToHireKWorkersTest {
    private final TotalCostToHireKWorkers totalCost = new TotalCostToHireKWorkers();

    @Test
    void example1() {
        int[] costs = {17, 12, 10, 2, 7, 2, 11, 20, 8};

        assertEquals(11, totalCost.totalCost(costs, 3, 4));
    }

    @Test
    void example2() {
        int[] costs = {1, 2, 4, 1};

        assertEquals(4, totalCost.totalCost(costs, 3, 3));
    }
}
