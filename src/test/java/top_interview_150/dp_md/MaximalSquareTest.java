package top_interview_150.dp_md;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximalSquareTest {
    @Test
    public void example1Test() {
        assertEquals(
                4,
                new MaximalSquare().maximalSquare(new char[][]{
                        {'1', '0', '1', '0', '0'},
                        {'1', '0', '1', '1', '1'},
                        {'1', '1', '1', '1', '1'},
                        {'1', '0', '0', '1', '0'}})
        );
    }

    @Test
    public void example2Test() {
        assertEquals(
                1, new MaximalSquare().maximalSquare(new char[][]{{'0', '1'}, {'1', '0'}}));
    }

    @Test
    public void example3Test() {
        assertEquals(0, new MaximalSquare().maximalSquare(new char[][]{{'0'}}));
    }
}
