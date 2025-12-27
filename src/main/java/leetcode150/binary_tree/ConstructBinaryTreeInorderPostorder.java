package leetcode150.binary_tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeInorderPostorder {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        return buildTreeUtil(0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode buildTreeUtil(int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd) {
        if (inorderStart > inorderEnd || postorderStart > postorderEnd) return null;

        int rootValue = postorder[postorderEnd];
        TreeNode root = new TreeNode(rootValue);
        int inorderIndex = map.get(rootValue);

        root.left = buildTreeUtil(inorderStart, inorderIndex - 1, postorder, postorderStart, postorderStart + inorderIndex - inorderStart - 1);
        root.right = buildTreeUtil(inorderIndex + 1, inorderEnd, postorder, postorderStart + inorderIndex - inorderStart, postorderEnd - 1);

        return root;
    }
}
