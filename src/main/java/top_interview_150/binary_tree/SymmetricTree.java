package top_interview_150.binary_tree;

public class SymmetricTree {
    boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null || root.right == null) return root.left == null && root.right == null;

        return isTheSame(root.left, root.right);
    }

    private boolean isTheSame(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == null && q == null;

        return p.val == q.val && isTheSame(p.left, q.right) && isTheSame(p.right, q.left);
    }
}
