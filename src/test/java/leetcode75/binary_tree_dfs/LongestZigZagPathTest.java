package leetcode75.binary_tree_dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestZigZagPathTest {
    private final LongestZigZagPath longestPath = new LongestZigZagPath();

    @Test
    void example1() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(1,
                        new TreeNode(1),
                        new TreeNode(1,
                                new TreeNode(1,
                                        null,
                                        new TreeNode(1,
                                                null,
                                                new TreeNode(1))),
                                new TreeNode(1))));

        assertEquals(3, longestPath.longestZigZag(root));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(1,
                        null,
                        new TreeNode(1,
                                new TreeNode(1,
                                        null,
                                        new TreeNode(1)),
                                new TreeNode(1))),
                new TreeNode(1));

        assertEquals(4, longestPath.longestZigZag(root));
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(1);

        assertEquals(0, longestPath.longestZigZag(root));
    }

    @Test
    void example4() {
        TreeNode root = new TreeNode(6,
                null,
                new TreeNode(7,
                        null,
                        new TreeNode(8,
                                new TreeNode(3,
                                        null,
                                        new TreeNode(10,
                                                new TreeNode(5,
                                                        null,
                                                        new TreeNode(9)),
                                                null)),
                                null)));

        assertEquals(5, longestPath.longestZigZag(root));
    }
}







































