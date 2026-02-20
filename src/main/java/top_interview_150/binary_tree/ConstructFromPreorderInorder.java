package top_interview_150.binary_tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructFromPreorderInorder {
    private int preorderIndex = 0;
    private final Map<Integer, Integer> inorderMap = new HashMap<>();

    // preorder gives the root first
    // postorder gives the root last
    // inorder allows to split the tree into left and right subtrees, based on the root's position
    // time complexity O(n)
    // space complexity O(n)
    TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) inorderMap.put(inorder[i], i);

        return buildTreeUtil(preorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeUtil(int[] preorder, int subtreeStart, int subtreeEnd) {
        if (subtreeStart > subtreeEnd) return null;

        int rootVal = preorder[preorderIndex];
        preorderIndex++;
        int inorderIndex = inorderMap.get(rootVal);

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTreeUtil(preorder, subtreeStart, inorderIndex - 1);
        root.right = buildTreeUtil(preorder, inorderIndex + 1, subtreeEnd);

        return root;
    }
}
