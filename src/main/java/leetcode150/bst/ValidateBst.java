package leetcode150.bst;

import leetcode150.binary_tree.TreeNode;

public class ValidateBst {
    Integer min = null;
    Integer max = null;

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode root) {
        if (root == null) return true;

        boolean left = inorder(root.left);
        if (min == null) min = root.val;
        if (min > root.val) return false;
        min = root.val;
        boolean right = inorder(root.right);
        if (max == null) max = root.val;
        if (max < root.val) return false;
        max = root.val;

        return left && right;
    }
}
