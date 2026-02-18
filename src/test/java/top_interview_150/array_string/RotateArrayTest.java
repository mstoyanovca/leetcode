package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {
    @Test
    public void example1Test() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotate(nums, 3);

        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    public void example2Test() {
        int[] nums = new int[]{1, 2};
        new RotateArray().rotate(nums, 7);

        assertArrayEquals(new int[]{2, 1}, nums);
    }
}
