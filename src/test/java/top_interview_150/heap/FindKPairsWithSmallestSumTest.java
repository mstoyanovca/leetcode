package top_interview_150.heap;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindKPairsWithSmallestSumTest {
    @Test
    public void example1Test() {
        assertEquals(
                List.of(List.of(1, 2), List.of(1, 4), List.of(1, 6)),
                new FindKPairsWithSmallestSum().kSmallestPairs(
                        new int[]{1, 7, 11},
                        new int[]{2, 4, 6},
                        3)
        );
    }

    @Test
    public void example2Test() {
        assertEquals(
                List.of(List.of(1, 1), List.of(1, 1)),
                new FindKPairsWithSmallestSum().kSmallestPairs(
                        new int[]{1, 1, 2},
                        new int[]{1, 2, 3},
                        2)
        );
    }
}
