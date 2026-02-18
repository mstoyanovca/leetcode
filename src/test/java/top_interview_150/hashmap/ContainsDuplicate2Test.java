package top_interview_150.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicate2Test {
    @Test
    public void example1Test() {
        assertTrue(new ContainsDuplicate2().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    public void example2Test() {
        assertTrue(new ContainsDuplicate2().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    @Test
    public void example3Test() {
        assertFalse(new ContainsDuplicate2().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
