package leetcode75.graphs_dfs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EvaluateDivisionTest {
    private final EvaluateDivision evaluateDivision = new EvaluateDivision();

    @Test
    void example1() {
        /*
          graph: a -> 2 -> b -> 3 -> c
          it means: a -> 6 -> c
          reversed: c -> 1/3 -> b -> 1/2 -> a
        */
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));

        assertArrayEquals(new double[]{6.0, 0.5, -1.0, 1.0, -1.0}, evaluateDivision.calcEquation(equations, values, queries));
    }

    @Test
    void example2() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        equations.add(Arrays.asList("bc", "cd"));
        double[] values = new double[]{1.5, 2.5, 5.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("c", "b"));
        queries.add(Arrays.asList("bc", "cd"));
        queries.add(Arrays.asList("cd", "bc"));

        assertArrayEquals(new double[]{3.75, 0.4, 5.0, 0.2}, evaluateDivision.calcEquation(equations, values, queries));
    }

    @Test
    void example3() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        double[] values = new double[]{0.5};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "b"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("x", "y"));

        assertArrayEquals(new double[]{0.5, 2.0, -1.0, -1.0}, evaluateDivision.calcEquation(equations, values, queries));
    }
}
