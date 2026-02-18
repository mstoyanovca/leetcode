package top_interview_150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathSumTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));

        assertTrue(new PathSum().hasPathSum(root, 22));
    }

    @Test
    public void example2Test() {
        assertFalse(new PathSum().hasPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5));
    }

    @Test
    public void example3Test() {
        assertFalse(new PathSum().hasPathSum(null, 0));
    }
}
