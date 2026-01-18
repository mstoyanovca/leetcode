package leetcode150.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationsTest {
    @Test
    public void example1Test() {
        assertEquals(List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)), new Permutations().permute(new int[]{1, 2, 3}));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of(List.of(0, 1), List.of(1, 0)), new Permutations().permute(new int[]{0, 1}));
    }
}
