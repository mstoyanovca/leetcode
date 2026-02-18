package leet_code_75.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubsequenceTest {
    private final IsSubsequence isSubsequence = new IsSubsequence();

    @Test
    void example1() {
        assertTrue(isSubsequence.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void example2() {
        assertFalse(isSubsequence.isSubsequence("axc", "ahbgdc"));
    }
}
