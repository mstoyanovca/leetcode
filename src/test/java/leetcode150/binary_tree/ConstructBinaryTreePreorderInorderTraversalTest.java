package leetcode150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructBinaryTreePreorderInorderTraversalTest {
    @Test
    public void example1Test() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode expected = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertEquals(expected, new ConstructBinaryTreePreorderInorderTraversal().buildTree(preorder, inorder));
    }

    @Test
    public void example2Test() {
        assertEquals(new TreeNode(-1), new ConstructBinaryTreePreorderInorderTraversal().buildTree(new int[]{-1}, new int[]{-1}));
    }
}
