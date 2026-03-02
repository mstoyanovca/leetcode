package top_interview_150.binary_tree_bfs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigzagLevelOrderTraversalTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> expected = List.of(List.of(3), List.of(20, 9), List.of(15, 7));

        assertEquals(expected, new ZigzagLevelOrderTraversal().zigzagLevelOrder(root));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of(List.of(1)), new ZigzagLevelOrderTraversal().zigzagLevelOrder(new TreeNode(1)));
    }

    @Test
    public void example3Test() {
        assertEquals(List.of(), new ZigzagLevelOrderTraversal().zigzagLevelOrder(null));
    }
}
