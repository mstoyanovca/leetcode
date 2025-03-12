package leetcode75.binary_search_tree;

import leetcode75.binary_tree_dfs.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DeleteNodeTest {
    private final DeleteNode deleteNode = new DeleteNode();

    @Test
    void example1() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2),
                        new TreeNode(4)),
                new TreeNode(6,
                        null,
                        new TreeNode(7)));
        // also valid, depending on algorithm:
        /*TreeNode updatedTree = new TreeNode(5,
                new TreeNode(2,
                        null,
                        new TreeNode(4)),
                new TreeNode(6,
                        null,
                        new TreeNode(7)));*/
        TreeNode updatedTree = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(2),
                        null),
                new TreeNode(6,
                        null,
                        new TreeNode(7)));


        assertEquals(updatedTree, deleteNode.deleteNode(root, 3));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2),
                        new TreeNode(4)),
                new TreeNode(6,
                        null,
                        new TreeNode(7)));

        assertEquals(root, deleteNode.deleteNode(root, 0));
    }

    @Test
    void example3() {
        assertNull(deleteNode.deleteNode(null, 0));
    }

    @Test
    void example4() {
        TreeNode root = new TreeNode(1);

        assertEquals(root, deleteNode.deleteNode(root, 0));
    }

    @Test
    void example5() {
        TreeNode root = new TreeNode(0);

        assertNull(deleteNode.deleteNode(root, 0));
    }

    @Test
    void example6() {
        // delete root test:
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2),
                        new TreeNode(4)),
                new TreeNode(6,
                        null,
                        new TreeNode(7)));
        TreeNode updatedTree = new TreeNode(6,
                new TreeNode(3,
                        new TreeNode(2),
                        new TreeNode(4)),
                new TreeNode(7));

        assertEquals(updatedTree, deleteNode.deleteNode(root, 5));
    }

    @Test
    void example7() {
        // delete root test:
        TreeNode root = new TreeNode(50,
                new TreeNode(30,
                        null,
                        new TreeNode(40)),
                new TreeNode(70,
                        new TreeNode(60),
                        new TreeNode(80)));
        TreeNode updatedTree = new TreeNode(60,
                new TreeNode(30,
                        null,
                        new TreeNode(40)),
                new TreeNode(70,
                        null,
                        new TreeNode(80)));

        assertEquals(updatedTree, deleteNode.deleteNode(root, 50));
    }
}
