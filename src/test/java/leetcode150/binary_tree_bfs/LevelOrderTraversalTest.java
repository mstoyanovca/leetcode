package leetcode150.binary_tree_bfs;

import leetcode150.binary_tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelOrderTraversalTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));

        assertEquals(expected, new LevelOrderTraversal().levelOrder(root));
    }

    @Test
    public void example2Test() {
        assertEquals(List.of(List.of(1)), new LevelOrderTraversal().levelOrder(new TreeNode(1)));
    }

    @Test
    public void example3Test() {
        assertEquals(List.of(), new LevelOrderTraversal().levelOrder(null));
    }
}
