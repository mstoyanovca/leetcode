package leet_code_75.hashmap_set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniqueNumberOfOccurrencesTest {
    private final UniqueNumberOfOccurrences numberOfOccurrences = new UniqueNumberOfOccurrences();

    @Test
    void example1() {
        assertTrue(numberOfOccurrences.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    @Test
    void example2() {
        assertFalse(numberOfOccurrences.uniqueOccurrences(new int[]{1, 2}));
    }

    @Test
    void example3() {
        assertTrue(numberOfOccurrences.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}
