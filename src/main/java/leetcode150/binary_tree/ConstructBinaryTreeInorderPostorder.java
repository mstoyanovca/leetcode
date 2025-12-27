package leetcode150.binary_tree;

import java.util.HashMap;

public class ConstructBinaryTreeInorderPostorder {
    // Map<Integer, Integer> map = new HashMap<>();
    int postorderIndex;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postorderIndex = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        return build(postorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] postorder, int subtreeStart, int subtreeEnd) {
        if (subtreeStart > subtreeEnd) return null;

        int rootVal = postorder[postorderIndex];
        postorderIndex--;
        TreeNode root = new TreeNode(rootVal);
        int inorderIndex = map.get(rootVal);

        root.right = build(postorder, inorderIndex + 1, subtreeEnd);
        root.left = build(postorder, subtreeStart, inorderIndex - 1);

        return root;
    }

    /*public TreeNode buildTreeUtil(int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd) {
        if (inorderStart > inorderEnd || postorderStart > postorderEnd) return null;

        int rootValue = postorder[postorderEnd];
        TreeNode root = new TreeNode(rootValue);
        int inorderIndex = map.get(rootValue);

        root.left = buildTreeUtil(inorderStart, inorderIndex - 1, postorder, postorderStart, postorderStart + inorderIndex - inorderStart - 1);
        root.right = buildTreeUtil(inorderIndex + 1, inorderEnd, postorder, postorderStart + inorderIndex - inorderStart, postorderEnd - 1);

        return root;
    }*/
}
