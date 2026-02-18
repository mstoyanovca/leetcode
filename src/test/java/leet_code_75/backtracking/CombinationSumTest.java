package leet_code_75.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumTest {
    private final CombinationSum combinationSum = new CombinationSum();

    @Test
    void example1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 2, 4));

        assertEquals(result, combinationSum.combinationSum3(3, 7));
    }

    @Test
    void example2() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 2, 6));
        result.add(Arrays.asList(1, 3, 5));
        result.add(Arrays.asList(2, 3, 4));

        assertEquals(result, combinationSum.combinationSum3(3, 9));
    }

    @Test
    void example3() {
        assertEquals(new ArrayList<>(), combinationSum.combinationSum3(4, 1));
    }

    @Test
    void example4() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 4));
        result.add(Arrays.asList(2, 3));

        assertEquals(result, combinationSum.combinationSum3(2, 5));
    }

    @Test
    void example5() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 2, 4));

        assertEquals(result, combinationSum.combinationSum3(3, 7));
    }
}
