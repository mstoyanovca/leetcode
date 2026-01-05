package leetcode150.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateDivisionTest {
    @Test
    public void example1Test() {
        /*
         * a ->  2  -> b ->  3  -> c
         * a <- 1/2 <- b <- 1/3 <- c
         */
        List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"));
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"), List.of("x", "x"));
        double[] expected = new double[]{6.0, 0.5, -1.0, 1.0, -1.0};

        assertEquals(expected, new EvaluateDivision().calcEquation(equations, values, queries));
    }

    @Test
    public void example2Test() {
        List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd"));
        double[] values = new double[]{1.5, 2.5, 5.0};
        List<List<String>> queries = List.of(List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"), List.of("cd", "bc"));
        double[] expected = new double[]{3.75, 0.4, 5.0, 0.2};

        assertEquals(expected, new EvaluateDivision().calcEquation(equations, values, queries));
    }

    @Test
    public void example3Test() {
        List<List<String>> equations = List.of(List.of("a", "b"));
        double[] values = new double[]{0.5};
        List<List<String>> queries = List.of(List.of("a", "b"), List.of("b", "a"), List.of("a", "c"), List.of("x", "y"));
        double[] expected = new double[]{0.5, 2.0, -1.0, -1.0};

        assertEquals(expected, new EvaluateDivision().calcEquation(equations, values, queries));
    }
}
