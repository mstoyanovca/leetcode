package leetcode150.bst;

import leetcode150.binary_tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAbsoluteDifferenceTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6));

        assertEquals(1, new MinimumAbsoluteDifference().getMinimumDifference(root));
    }

    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48, new TreeNode(12), new TreeNode(49)));

        assertEquals(1, new MinimumAbsoluteDifference().getMinimumDifference(root));
    }
}
