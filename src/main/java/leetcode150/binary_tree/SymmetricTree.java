package leetcode150.binary_tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null || root.right == null) return root.left == null && root.right == null;
        if (root.left.left == null || root.left.right == null) return root.left.left == null && root.left.right == null;
        if (root.right.left == null || root.right.right == null)
            return root.right.left == null && root.right.right == null;

        boolean result = root.left.left.val == root.right.right.val && root.left.right.val == root.right.left.val;

        return root.left == root.right && result && isSymmetric(root.left) && isSymmetric(root.right);
    }
}
