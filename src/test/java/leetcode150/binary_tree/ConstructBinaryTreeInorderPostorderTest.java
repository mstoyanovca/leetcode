package leetcode150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructBinaryTreeInorderPostorderTest {
    @Test
    public void example1Test() {
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};
        TreeNode expected = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertEquals(expected, new ConstructBinaryTreeInorderPostorder().buildTree(inorder, postorder));
    }

    @Test
    public void example2Test() {
        assertEquals(new TreeNode(-1), new ConstructBinaryTreeInorderPostorder().buildTree(new int[]{-1}, new int[]{-1}));
    }
}
