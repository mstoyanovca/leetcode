package leet_code_75.binary_tree_dfs;

// problem 33:
public class MaximumDepthOfBinaryTree {
    // DFS: depth first search:
    int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
