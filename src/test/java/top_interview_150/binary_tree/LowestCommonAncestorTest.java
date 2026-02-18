package top_interview_150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorTest {
    private final TreeNode root = new TreeNode(3,
            new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
            new TreeNode(1, new TreeNode(0), new TreeNode(8))
    );

    @Test
    public void example1Test() {
        assertEquals(new TreeNode(3), new LowestCommonAncestor().lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1)));
    }

    @Test
    public void example2Test() {
        assertEquals(new TreeNode(5), new LowestCommonAncestor().lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4)));
    }

    @Test
    public void example3Test() {
        assertEquals(new TreeNode(1), new LowestCommonAncestor().lowestCommonAncestor(new TreeNode(1, new TreeNode(2), null), new TreeNode(1), new TreeNode(2)));
    }

    @Test
    public void example4Test() {
        assertEquals(new TreeNode(1), new LowestCommonAncestor().lowestCommonAncestor(new TreeNode(1, new TreeNode(2), null), new TreeNode(2), new TreeNode(1)));
    }
}
