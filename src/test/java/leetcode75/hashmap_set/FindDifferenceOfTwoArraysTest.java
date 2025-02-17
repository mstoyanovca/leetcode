package leetcode75.hashmap_set;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDifferenceOfTwoArraysTest {
    private final FindDifferenceOfTwoArrays differenceOfTwoArrays = new FindDifferenceOfTwoArrays();

    @Test
    void example1() {
        assertEquals(Arrays.asList(Arrays.asList(1, 3), Arrays.asList(4, 6)), differenceOfTwoArrays.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
    }

    @Test
    void example2() {
        assertEquals(Arrays.asList(List.of(3), List.of()), differenceOfTwoArrays.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
    }
}
