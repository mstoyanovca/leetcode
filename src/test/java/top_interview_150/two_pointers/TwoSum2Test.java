package top_interview_150.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSum2Test {
    @Test
    public void example1Test() {
        assertArrayEquals(new int[]{1, 2}, new TwoSum2().twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void example2Test() {
        assertArrayEquals(new int[]{1, 3}, new TwoSum2().twoSum(new int[]{2, 3, 4}, 6));
    }

    @Test
    public void example3Test() {
        assertArrayEquals(new int[]{1, 2}, new TwoSum2().twoSum(new int[]{-1, 0}, -1));
    }
}
