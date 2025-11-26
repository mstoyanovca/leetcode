package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasStationTest {
    @Test
    public void example1Test() {
        assertEquals(3, new GasStation().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void example2Test() {
        assertEquals(-1, new GasStation().canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new GasStation().canCompleteCircuit(new int[]{2}, new int[]{2}));
    }

    @Test
    public void example4Test() {
        assertEquals(0, new GasStation().canCompleteCircuit(new int[]{1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1}));
    }
}
