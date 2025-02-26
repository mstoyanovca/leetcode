package leetcode75.binary_tree_dfs;

// problem 33:
public class MaximumDepthOfBinaryTree {
    // depth first search:
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
