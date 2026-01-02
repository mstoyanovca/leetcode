package leetcode150.bst;

import leetcode150.binary_tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBstTest {
    @Test
    public void example1Test() {
        assertTrue(new ValidateBst().isValidBST(
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3))));
    }

    @Test
    public void example2Test() {
        assertFalse(new ValidateBst().isValidBST(
                new TreeNode(5,
                        new TreeNode(1),
                        new TreeNode(4, new TreeNode(3), new TreeNode(6))))
        );
    }
}
