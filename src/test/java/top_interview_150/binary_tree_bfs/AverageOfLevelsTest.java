package top_interview_150.binary_tree_bfs;

import top_interview_150.binary_tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageOfLevelsTest {
    @Test
    public void example1Test() {
        assertEquals(
                List.of(3.00000, 14.50000, 11.00000),
                new AverageOfLevels().averageOfLevels(
                        new TreeNode(3,
                                new TreeNode(9),
                                new TreeNode(20, new TreeNode(15), new TreeNode(7))))
        );
    }

    @Test
    public void example2Test() {
        assertEquals(
                List.of(3.00000, 14.50000, 11.00000),
                new AverageOfLevels().averageOfLevels(
                        new TreeNode(3,
                                new TreeNode(9, new TreeNode(15), new TreeNode(7)),
                                new TreeNode(20)))
        );
    }
}
