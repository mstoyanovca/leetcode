package leetcode75.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfKSumPairsTest {
    private final MaxNumberOfKSumPairs maxNumberOfKSumPairs = new MaxNumberOfKSumPairs();

    @Test
    void example1() {
        assertEquals(2, maxNumberOfKSumPairs.maxOperations(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    void example2() {
        assertEquals(1, maxNumberOfKSumPairs.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
    }

    @Test
    void example3() {
        assertEquals(2, maxNumberOfKSumPairs.maxOperations(new int[]{4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4}, 2));
    }

    @Test
    void example4() {
        assertEquals(0, maxNumberOfKSumPairs.maxOperations(new int[]{3, 5, 1, 5}, 2));
    }

    @Test
    void example5() {
        assertEquals(2, maxNumberOfKSumPairs.maxOperations(new int[]{2, 2, 2, 3, 1, 1, 4, 1}, 4));
    }
}
