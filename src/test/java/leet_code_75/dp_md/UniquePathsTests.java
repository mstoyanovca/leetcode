package leet_code_75.dp_md;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsTests {
    private final UniquePaths uniquePaths = new UniquePaths();

    @Test
    void example1() {
        assertEquals(28, uniquePaths.uniquePaths(3, 7));
    }

    @Test
    void example2() {
        assertEquals(3, uniquePaths.uniquePaths(3, 2));
    }
}
