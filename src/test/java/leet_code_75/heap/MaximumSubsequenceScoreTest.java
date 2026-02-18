package leet_code_75.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubsequenceScoreTest {
    private final MaximumSubsequenceScore maximumScore = new MaximumSubsequenceScore();

    @Test
    void example1() {
        int[] nums1 = {1, 3, 3, 2};
        int[] nums2 = {2, 1, 3, 4};

        assertEquals(12, maximumScore.maxScore(nums1, nums2, 3));
    }

    @Test
    void example2() {
        int[] nums1 = {4, 2, 3, 1, 1};
        int[] nums2 = {7, 5, 10, 9, 6};

        assertEquals(30, maximumScore.maxScore(nums1, nums2, 1));
    }
}
