package leetcode75.binary_tree_dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountGoodNodesInBinaryTreeTest {
    private final CountGoodNodesInBinaryTree countGoodNodesInBinaryTree = new CountGoodNodesInBinaryTree();

    @Test
    void example1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(1,
                        new TreeNode(3),
                        null),
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(5)));

        assertEquals(4, countGoodNodesInBinaryTree.goodNodes(root));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(3,
                new TreeNode(3,
                        new TreeNode(4),
                        new TreeNode(2)),
                null);

        assertEquals(3, countGoodNodesInBinaryTree.goodNodes(root));
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(1);

        assertEquals(1, countGoodNodesInBinaryTree.goodNodes(root));
    }

    @Test
    void example5() {
        TreeNode root = new TreeNode(2,
                null,
                new TreeNode(4,
                        new TreeNode(10),
                        new TreeNode(8,
                                new TreeNode(4),
                                null)));

        assertEquals(4, countGoodNodesInBinaryTree.goodNodes(root));
    }
}
