package leetcode150.binary_tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeInorderPostorder {
    private final Map<Integer, Integer> map = new HashMap<>();
    int postOrderIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);

        return buildTreeUtil(postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTreeUtil(int[] postorder, int subtreeStart, int subtreeEnd) {
        if (subtreeStart > subtreeEnd) return null;

        postOrderIndex = postorder.length - 1;
        int rootValue = postorder[postOrderIndex];
        postOrderIndex--;
        int inorderIndex = map.get(rootValue);

        TreeNode root = new TreeNode(rootValue);
        root.left = buildTreeUtil(postorder, subtreeStart, inorderIndex - 1);
        root.right = buildTreeUtil(postorder, inorderIndex + 1, subtreeEnd);

        return root;
    }
}
