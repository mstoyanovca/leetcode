package top_interview_150.binary_tree;

public class InvertBinaryTree {
    TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
