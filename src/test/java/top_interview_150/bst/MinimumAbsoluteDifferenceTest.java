package top_interview_150.bst;

import top_interview_150.binary_tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAbsoluteDifferenceTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6)
        );

        assertEquals(1, new MinimumAbsoluteDifference().getMinimumDifference(root));
    }

    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48, new TreeNode(12), new TreeNode(49))
        );

        assertEquals(1, new MinimumAbsoluteDifference().getMinimumDifference(root));
    }

    @Test
    public void example3Test() {
        TreeNode root = new TreeNode(236,
                new TreeNode(104, null, new TreeNode(227)),
                new TreeNode(701, null, new TreeNode(911))
        );

        assertEquals(9, new MinimumAbsoluteDifference().getMinimumDifference(root));
    }

    @Test
    public void example4Test() {
        assertEquals(100000, new MinimumAbsoluteDifference().getMinimumDifference(new TreeNode(100000, new TreeNode(0), null)));
    }
}
