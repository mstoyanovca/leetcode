package leetcode150.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicStringsTest {
    @Test
    public void example1Test() {
        assertTrue(new IsomorphicStrings().isIsomorphic("egg", "add"));
    }

    @Test
    public void example2Test() {
        assertFalse(new IsomorphicStrings().isIsomorphic("foo", "bar"));
    }

    @Test
    public void example3Test() {
        assertTrue(new IsomorphicStrings().isIsomorphic("paper", "title"));
    }

    @Test
    public void example4Test() {
        assertFalse(new IsomorphicStrings().isIsomorphic("badc", "baba"));
    }
}
