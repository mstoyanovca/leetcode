package leetcode150.binary_tree;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root.left != null && root.right != null && (root.left.val == p.val && root.right.val == q.val || root.left.val == q.val && root.right.val == p.val)) {
            return root;
        } else if (root.left != null && root.left.val == p.val) {
            return root.left;
        } else if (root.right != null && root.right.val == p.val) {
            return root.right;
        }

        root.left = lowestCommonAncestor(root.left, p, q);
        root.right = lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
