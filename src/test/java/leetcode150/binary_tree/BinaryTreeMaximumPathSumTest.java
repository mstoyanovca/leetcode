package leetcode150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeMaximumPathSumTest {
    @Test
    public void example1Test() {
        assertEquals(6, new BinaryTreeMaximumPathSum().maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }

    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(-10,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertEquals(42, new BinaryTreeMaximumPathSum().maxPathSum(root));
    }

    @Test
    public void example3Test() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(15), new TreeNode(4, null, new TreeNode(1))));

        assertEquals(48, new BinaryTreeMaximumPathSum().maxPathSum(root));
    }
}
