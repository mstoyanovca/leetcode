package leetcode150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FlattenToLinkedLIstTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6)));
        TreeNode expected = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5)))));

        new FlattenToLinkedLIst().flatten(root);
        assertEquals(expected, root);
    }

    @Test
    public void example2Test() {
        TreeNode root = null;
        new FlattenToLinkedLIst().flatten(root);
        assertNull(root);
    }

    @Test
    public void example3Test() {
        TreeNode root = new TreeNode(0);
        new FlattenToLinkedLIst().flatten(root);

        assertEquals(new TreeNode(0), root);
    }
}
