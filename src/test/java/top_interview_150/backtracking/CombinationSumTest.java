package top_interview_150.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumTest {
    @Test
    public void example1Test() {
        assertEquals(List.of(List.of(2, 2, 3), List.of(7)), new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)), new CombinationSum().combinationSum(new int[]{2, 3, 5}, 8));
    }

    @Test
    public void example3Test() {
        assertEquals(List.of(), new CombinationSum().combinationSum(new int[]{2}, 1));
    }
}
