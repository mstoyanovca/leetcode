package leetcode150.binary_tree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
}
