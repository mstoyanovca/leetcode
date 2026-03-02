package leet_code_75.binary_tree_bfs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeRightSideViewTest {
    private final BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();

    @Test
    void example1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(5)),
                new TreeNode(3,
                        null,
                        new TreeNode(4)));

        assertEquals(Arrays.asList(1, 3, 4), binaryTreeRightSideView.rightSideView(root));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(5),
                                null),
                        null),
                new TreeNode(3));

        assertEquals(Arrays.asList(1, 3, 4, 5), binaryTreeRightSideView.rightSideView(root));
    }

    @Test
    void example3() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(3));

        assertEquals(Arrays.asList(1, 3), binaryTreeRightSideView.rightSideView(root));
    }

    @Test
    void example4() {
        assertEquals(new ArrayList<>(), binaryTreeRightSideView.rightSideView(null));
    }
}
