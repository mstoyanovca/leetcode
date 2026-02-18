package top_interview_150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTreeTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );

        assertTrue(new SymmetricTree().isSymmetric(root));
    }

    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3))
        );

        assertFalse(new SymmetricTree().isSymmetric(root));
    }

    @Test
    public void example3Test() {
        assertFalse(new SymmetricTree().isSymmetric(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }
}
