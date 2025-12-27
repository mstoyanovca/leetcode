package leetcode150.binary_tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreePreorderInorder {
    int preorderIndex = 0;
    private final Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);

        return buildTreeUtil(preorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeUtil(int[] preorder, int subtreeStart, int subtreeEnd) {
        if (subtreeStart > subtreeEnd) return null;

        int rootVal = preorder[preorderIndex];
        preorderIndex++;
        int inorderIndex = map.get(rootVal);

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTreeUtil(preorder, subtreeStart, inorderIndex - 1);
        root.right = buildTreeUtil(preorder, inorderIndex + 1, subtreeEnd);

        return root;
    }
}
