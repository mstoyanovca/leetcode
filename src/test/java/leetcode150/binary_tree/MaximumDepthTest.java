package leetcode150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)));

        assertEquals(3, new MaximumDepth().maxDepth(root));
    }

    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));

        assertEquals(2, new MaximumDepth().maxDepth(root));
    }
}
