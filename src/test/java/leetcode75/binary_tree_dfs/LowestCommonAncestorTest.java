package leetcode75.binary_tree_dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorTest {
    private final LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

    @Test
    void example1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(8)));

        assertEquals(root, lowestCommonAncestor.lowestCommonAncestor(root, root.left, root.right));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(8)));

        assertEquals(root.left, lowestCommonAncestor.lowestCommonAncestor(root, root.left, root.left.right.right));
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);

        assertEquals(root, lowestCommonAncestor.lowestCommonAncestor(root, root, root.left));
    }
}
