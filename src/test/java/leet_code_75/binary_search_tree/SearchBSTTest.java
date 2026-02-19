package leet_code_75.binary_search_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SearchBSTTest {
    private final SearchBST searchTree = new SearchBST();

    @Test
    void example1() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7));
        TreeNode subTree = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        assertEquals(subTree, searchTree.searchBST(root, 2));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7));

        assertNull(searchTree.searchBST(root, 5));
    }
}
