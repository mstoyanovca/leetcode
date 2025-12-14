package leetcode150.intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplifyPathTest {
    @Test
    public void example1Test() {
        assertEquals("/home", new SimplifyPath().simplifyPath("/home/"));
    }

    @Test
    public void example2Test() {
        assertEquals("/home/foo", new SimplifyPath().simplifyPath("/home//foo/"));
    }

    @Test
    public void example3Test() {
        assertEquals("/home/user/Pictures", new SimplifyPath().simplifyPath("/home/user/Documents/../Pictures"));
    }

    @Test
    public void example4Test() {
        assertEquals("/", new SimplifyPath().simplifyPath("/../"));
    }

    @Test
    public void example5Test() {
        assertEquals("/.../b/d", new SimplifyPath().simplifyPath("/.../a/../b/c/../d/./"));
    }
}
