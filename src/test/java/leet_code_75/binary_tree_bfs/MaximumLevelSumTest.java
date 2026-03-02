package leet_code_75.binary_tree_bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumLevelSumTest {
    private final MaximumLevelSum maxSum = new MaximumLevelSum();

    @Test
    void example1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(7,
                        new TreeNode(7),
                        new TreeNode(-8)),
                new TreeNode(0));

        assertEquals(2, maxSum.maxLevelSum(root));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(989,
                null,
                new TreeNode(10250,
                        new TreeNode(98693),
                        new TreeNode(-89388,
                                null,
                                new TreeNode(-32127))));

        assertEquals(2, maxSum.maxLevelSum(root));
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(-100,
                new TreeNode(-200,
                        new TreeNode(-20),
                        new TreeNode(-5)),
                new TreeNode(-300,
                        new TreeNode(-10),
                        null));

        assertEquals(3, maxSum.maxLevelSum(root));
    }
}
