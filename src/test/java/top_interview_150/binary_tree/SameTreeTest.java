package top_interview_150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {
    @Test
    public void example1Test() {
        assertTrue(new SameTree().isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }

    @Test
    public void example2Test() {
        assertFalse(new SameTree().isSameTree(
                new TreeNode(1, new TreeNode(2), null),
                new TreeNode(1, null, new TreeNode(2))));
    }

    @Test
    public void example3Test() {
        assertFalse(new SameTree().isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(1)),
                new TreeNode(1, new TreeNode(1), new TreeNode(2))));
    }
}
