package top_interview_150.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NQueens2Test {
    @Test
    public void example1Test() {
        assertEquals(2, new NQueens2().totalNQueens(4));
    }

    @Test
    public void example2Test() {
        assertEquals(1, new NQueens2().totalNQueens(1));
    }
}
