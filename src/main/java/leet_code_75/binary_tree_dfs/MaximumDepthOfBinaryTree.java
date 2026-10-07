package leet_code_75.binary_tree_dfs;

public class MaximumDepthOfBinaryTree {
    int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
