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
}
