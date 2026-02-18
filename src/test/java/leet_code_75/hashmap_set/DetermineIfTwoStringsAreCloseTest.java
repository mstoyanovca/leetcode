package leet_code_75.hashmap_set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetermineIfTwoStringsAreCloseTest {
    private final DetermineIfTwoStringsAreClose twoStringsAreClose = new DetermineIfTwoStringsAreClose();

    @Test
    void example1() {
        assertTrue(twoStringsAreClose.closeStrings("abc", "bca"));
    }

    @Test
    void example2() {
        assertFalse(twoStringsAreClose.closeStrings("a", "aa"));
    }

    @Test
    void example3() {
        assertTrue(twoStringsAreClose.closeStrings("cabbba", "abbccc"));
    }

    @Test
    void example4() {
        assertFalse(twoStringsAreClose.closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff"));
    }
}
