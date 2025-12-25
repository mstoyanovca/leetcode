package leetcode150.binary_tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean left;
        if (p.left != null && q.left != null) {
            left = isSameTree(p.left, q.left);
        } else {
            left = p.left == null && q.left == null;
        }
        boolean right;
        if (p.right != null && q.right != null) {
            right = isSameTree(p.right, q.right);
        } else {
            right = p.right == null && q.right == null;
        }
        return left && right;
    }
}
