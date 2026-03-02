package top_interview_150.dp_md;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePaths2Test {
    @Test
    public void example1Test() {
        assertEquals(2, new UniquePaths2().uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new UniquePaths2().uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new UniquePaths2().uniquePathsWithObstacles(new int[][]{{0, 0}, {0, 1}}));
    }

    @Test
    public void example4Test() {
        assertEquals(0, new UniquePaths2().uniquePathsWithObstacles(new int[][]{{1, 0}}));
    }

    @Test
    public void example5Test() {
        assertEquals(0, new UniquePaths2().uniquePathsWithObstacles(new int[][]{{0, 1, 0, 0}}));
    }
}
