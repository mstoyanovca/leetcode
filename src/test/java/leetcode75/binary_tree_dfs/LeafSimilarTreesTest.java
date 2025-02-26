package leetcode75.binary_tree_dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeafSimilarTreesTest {
    private final LeafSimilarTrees similarTrees = new LeafSimilarTrees();

    @Test
    void example1() {
        TreeNode root1 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(9),
                        new TreeNode(8)));
        TreeNode root2 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(7)),
                new TreeNode(1,
                        new TreeNode(4),
                        new TreeNode(2,
                                new TreeNode(9),
                                new TreeNode(8))));

        assertTrue(similarTrees.leafSimilar(root1, root2));
    }

    @Test
    void example2() {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        TreeNode root2 = new TreeNode(1,
                new TreeNode(3),
                new TreeNode(2));

        assertFalse(similarTrees.leafSimilar(root1, root2));
    }

    @Test
    void example3() {
        // [3,5,1,6,2,9,8,null,null,7,4]
        TreeNode root1 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(9),
                        new TreeNode(8)));
        // [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
        TreeNode root2 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(7)),
                new TreeNode(1,
                        new TreeNode(4),
                        new TreeNode(2,
                                new TreeNode(9),
                                new TreeNode(8))));

        assertTrue(similarTrees.leafSimilar(root1, root2));
    }
}
