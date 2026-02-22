package top_interview_150.binary_tree;

import java.util.HashMap;

public class ConstructFromInorderPostorder {
    private int postorderIndex;
    private final HashMap<Integer, Integer> inorderMap = new HashMap<>();

    // preorder gives the root first
    // postorder gives the root last
    // inorder allows to split the tree into left and right subtrees, based on the root's position
    // time complexity O(n)
    // space complexity O(n)
    TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        postorderIndex = n - 1;
        for (int i = 0; i < n; i++) inorderMap.put(inorder[i], i);

        return build(postorder, 0, n - 1);
    }

    private TreeNode build(int[] postorder, int subtreeStart, int subtreeEnd) {
        if (subtreeStart > subtreeEnd) return null;

        int rootVal = postorder[postorderIndex];
        postorderIndex--;
        int inorderIndex = inorderMap.get(rootVal);

        TreeNode root = new TreeNode(rootVal);
        // don't swap next 2 lines:
        root.right = build(postorder, inorderIndex + 1, subtreeEnd);
        root.left = build(postorder, subtreeStart, inorderIndex - 1);

        return root;
    }
}
