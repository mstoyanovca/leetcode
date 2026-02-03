package leetcode150.graph_bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumGeneticMutationTest {
    @Test
    public void example1Test() {
        assertEquals(1, new MinimumGeneticMutation().minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}));
    }

    @Test
    public void example2Test() {
        assertEquals(2, new MinimumGeneticMutation().minMutation("AACCGGTT", "AAACGGTA", new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
    }
}
