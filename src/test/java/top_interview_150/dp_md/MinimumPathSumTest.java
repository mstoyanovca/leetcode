package top_interview_150.dp_md;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumPathSumTest {
    @Test
    public void example1Test() {
        assertEquals(7, new MinimumPathSum().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

    @Test
    public void example2Test() {
        assertEquals(12, new MinimumPathSum().minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
