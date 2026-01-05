package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicates1Test {
    @Test
    public void example1Test() {
        assertEquals(2, new RemoveDuplicates1().removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    public void example2Test() {
        assertEquals(5, new RemoveDuplicates1().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    @Test
    public void example3Test() {
        assertEquals(2, new RemoveDuplicates1().removeDuplicates(new int[]{1, 1, 2}));
    }
}
