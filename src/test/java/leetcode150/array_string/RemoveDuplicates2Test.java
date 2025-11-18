package leetcode150.array_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicates2Test {
    @Test
    public void example1Test() {
        assertEquals(5, new RemoveDuplicates2().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
}
