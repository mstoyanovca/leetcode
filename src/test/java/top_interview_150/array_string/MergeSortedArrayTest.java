package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {
    @Test
    public void example1Test() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        new MergeSortedArray().merge(nums1, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void example2Test() {
        int[] nums1 = {-1, 3, 0, 0, 0, 0, 0};
        new MergeSortedArray().merge(nums1, 2, new int[]{0, 0, 1, 2, 3}, 5);
        assertArrayEquals(new int[]{-1, 0, 0, 1, 2, 3, 3}, nums1);
    }

    @Test
    public void example3Test() {
        int[] nums1 = {0};
        new MergeSortedArray().merge(nums1, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void example4Test() {
        int[] nums1 = {2, 0};
        new MergeSortedArray().merge(nums1, 1, new int[]{1}, 1);
        assertArrayEquals(new int[]{1, 2}, nums1);
    }

    @Test
    public void example5Test() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        new MergeSortedArray().merge(nums1, 3, new int[]{1, 2, 3}, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }
}
