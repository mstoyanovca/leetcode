package leetcode150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCompleteTreeNodesTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null)
        );

        assertEquals(6, new CountCompleteTreeNodes().countNodes(root));
    }

    @Test
    public void example2Test() {
        assertEquals(0, new CountCompleteTreeNodes().countNodes(null));
    }

    @Test
    public void example3Test() {
        assertEquals(1, new CountCompleteTreeNodes().countNodes(new TreeNode(1)));
    }
}
