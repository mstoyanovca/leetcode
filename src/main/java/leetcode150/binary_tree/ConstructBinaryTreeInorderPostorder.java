package leetcode150.binary_tree;

import java.util.HashMap;

public class ConstructBinaryTreeInorderPostorder {
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
        int inorderIndex = map.get(rootVal);

        TreeNode root = new TreeNode(rootVal);
        root.right = build(postorder, inorderIndex + 1, subtreeEnd);
        root.left = build(postorder, subtreeStart, inorderIndex - 1);

        return root;
    }
}
