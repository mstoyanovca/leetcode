package top_interview_150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvertBinaryTreeTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );
        TreeNode expected = new TreeNode(4,
                new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                new TreeNode(2, new TreeNode(3), new TreeNode(1))
        );

        assertEquals(expected, new InvertBinaryTree().invertTree(root));
    }

    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode expected = new TreeNode(2, new TreeNode(3), new TreeNode(1));

        assertEquals(expected, new InvertBinaryTree().invertTree(root));
    }

    @Test
    public void example3Test() {
        assertNull(new InvertBinaryTree().invertTree(null));
    }
}
