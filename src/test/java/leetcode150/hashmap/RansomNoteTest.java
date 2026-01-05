package leetcode150.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTest {
    @Test
    public void example1Test() {
        assertFalse(new RansomNote().canConstruct("a", "b"));
    }

    @Test
    public void example2Test() {
        assertFalse(new RansomNote().canConstruct("aa", "ab"));
    }

    @Test
    public void example3Test() {
        assertTrue(new RansomNote().canConstruct("aa", "aab"));
    }
}
