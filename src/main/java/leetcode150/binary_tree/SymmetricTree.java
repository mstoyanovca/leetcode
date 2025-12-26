package leetcode150.binary_tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null || root.right == null) return root.left == null && root.right == null;

        boolean result;
        if (root.left.left != null && root.left.right != null && root.right.left != null && root.right.right != null) {
            result = root.left.left.val == root.right.right.val && root.left.right.val == root.right.left.val;
        } else {
            result = true;
        }

        return root.left.val == root.right.val && result && isSymmetric(root.left) && isSymmetric(root.right);
    }
}
