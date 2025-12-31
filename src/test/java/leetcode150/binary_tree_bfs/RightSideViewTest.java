package leetcode150.binary_tree_bfs;

import leetcode150.binary_tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RightSideViewTest {
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4))
        );

        assertEquals(List.of(1, 3, 4), new RightSideView().rightSideView(root));
    }

    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(5), null), null),
                new TreeNode(3)
        );

        assertEquals(List.of(1, 3, 4, 5), new RightSideView().rightSideView(root));
    }

    @Test
    public void example3Test() {
        assertEquals(List.of(1, 3), new RightSideView().rightSideView(new TreeNode(1, null, new TreeNode(3))));
    }

    @Test
    public void example4Test() {
        assertEquals(List.of(), new RightSideView().rightSideView(null));
    }
}
