package top_interview_150.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationsTest {
    @Test
    public void example1Test() {
        assertEquals(List.of(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3), List.of(2, 4), List.of(3, 4)), new Combinations().combine(4, 2));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of(List.of(1)), new Combinations().combine(1, 1));
    }
}
