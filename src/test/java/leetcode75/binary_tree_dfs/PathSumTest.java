package leetcode75.binary_tree_dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathSumTest {
    private final PathSum pathSum = new PathSum();

    @Test
    void example1() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(3),
                                new TreeNode(-2)),
                        new TreeNode(2,
                                null,
                                new TreeNode(1))),
                new TreeNode(-3,
                        null,
                        new TreeNode(11)));

        assertEquals(3, pathSum.pathSum(root, 8));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                new TreeNode(5),
                                new TreeNode(1))));

        assertEquals(3, pathSum.pathSum(root, 22));
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(1_000_000_000,
                new TreeNode(1_000_000_000,
                        new TreeNode(294967296,
                                new TreeNode(1_000_000_000,
                                        new TreeNode(1_000_000_000,
                                                new TreeNode(1_000_000_000),
                                                null),
                                        null),
                                null),
                        null),
                null);

        assertEquals(0, pathSum.pathSum(root, 0));
    }
}
