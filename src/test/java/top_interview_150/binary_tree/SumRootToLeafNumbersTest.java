package top_interview_150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumRootToLeafNumbersTest {
    @Test
    public void example1Test() {
        assertEquals(25, new SumRootToLeafNumbers().sumNumbers(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }

    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(4,
                new TreeNode(9, new TreeNode(5), new TreeNode(1)),
                new TreeNode(0));

        assertEquals(1026, new SumRootToLeafNumbers().sumNumbers(root));
    }
}
