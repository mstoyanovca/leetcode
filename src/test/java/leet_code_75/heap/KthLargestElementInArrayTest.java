package leet_code_75.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestElementInArrayTest {
    private final KthLargestElementInArray largestElementInArray = new KthLargestElementInArray();

    @Test
    void example1() {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};

        assertEquals(5, largestElementInArray.findKthLargest(nums, 2));
    }

    @Test
    void example2() {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};

        assertEquals(4, largestElementInArray.findKthLargest(nums, 4));
    }
}
