package leetcode150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BSTIteratorTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(7,
                new TreeNode(3),
                new TreeNode(15, new TreeNode(9), new TreeNode(20)));
        BSTIterator bstIterator = new BSTIterator(root);

        assertEquals(3, bstIterator.next());
        assertEquals(7, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(9, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(15, bstIterator.next());
        assertTrue(bstIterator.hasNext());
        assertEquals(20, bstIterator.next());
        assertFalse(bstIterator.hasNext());
    }
}
