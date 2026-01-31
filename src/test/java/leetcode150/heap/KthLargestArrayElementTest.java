package leetcode150.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestArrayElementTest {
    @Test
    public void example1Test() {
        assertEquals(5, new KthLargestArrayElement().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void example2Test() {
        assertEquals(4, new KthLargestArrayElement().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
