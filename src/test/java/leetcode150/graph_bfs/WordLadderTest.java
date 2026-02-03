package leetcode150.graph_bfs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordLadderTest {
    @Test
    public void example1Test() {
        assertEquals(5, new WordLadder().ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    public void example2Test() {
        assertEquals(0, new WordLadder().ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }

    @Test
    public void example3Test() {
        assertEquals(3, new WordLadder().ladderLength("hot", "dog", List.of("hot", "dog", "dot")));
    }
}
