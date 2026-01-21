package leetcode150.divide_conquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedArrayToBSTTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(0, new TreeNode(-3, new TreeNode(-10), null), new TreeNode(9, new TreeNode(5), null));

        assertEquals(root, new SortedArrayToBST().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
    }

    @Test
    public void example2Test() {
        assertEquals(new TreeNode(3, new TreeNode(1), null), new SortedArrayToBST().sortedArrayToBST(new int[]{1, 3}));
    }
}
