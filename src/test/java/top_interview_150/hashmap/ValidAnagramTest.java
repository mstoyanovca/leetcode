package top_interview_150.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {
    @Test
    public void example1Test() {
        assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    @Test
    public void example2Test() {
        assertFalse(new ValidAnagram().isAnagram("rat", "car"));
    }
}
