package top_interview_150.bst;

import top_interview_150.binary_tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2)),
                new TreeNode(4)
        );

        assertEquals(1, new KthSmallestElement().kthSmallest(root, 1));
    }

    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                new TreeNode(6)
        );

        assertEquals(3, new KthSmallestElement().kthSmallest(root, 3));
    }
}
