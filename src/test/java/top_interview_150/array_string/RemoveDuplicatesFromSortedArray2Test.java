package top_interview_150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArray2Test {
    @Test
    public void example1Test() {
        assertEquals(5, new RemoveDuplicatesFromSortedArray2().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    @Test
    public void example2Test() {
        assertEquals(7, new RemoveDuplicatesFromSortedArray2().removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }
}
