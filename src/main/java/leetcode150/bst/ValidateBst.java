package leetcode150.bst;

import leetcode150.binary_tree.TreeNode;

public class ValidateBst {
    private Long min = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode root) {
        if (root == null) return true;

        boolean left = inorder(root.left);
        if (min >= root.val) return false;
        min = (long) root.val;

        boolean right = inorder(root.right);

        return left && right;
    }
}
