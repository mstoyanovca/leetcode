package top_interview_150.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Search2DMatrixTest {
    @Test
    public void example1Test() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        assertTrue(new Search2DMatrix().searchMatrix(matrix, 3));
    }

    @Test
    public void example2Test() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        assertFalse(new Search2DMatrix().searchMatrix(matrix, 13));
    }

    @Test
    public void example3Test() {
        assertFalse(new Search2DMatrix().searchMatrix(new int[][]{{1}}, 0));
    }

    @Test
    public void example4Test() {
        assertTrue(new Search2DMatrix().searchMatrix(new int[][]{{1, 3}}, 3));
    }
}
