package leetcode75.binary_tree_dfs;

// problem 37:
public class LongestZigZagPath {
    private enum Direction {LEFT, RIGHT}

    public int longestZigZag(TreeNode root) {
        return Math.max(dfs(root, "LEFT"), dfs(root, "RIGHT"));
    }

    private int dfs(TreeNode node, String direction) {
        if (node == null) return 0;
        if (direction.equals("LEFT")) {
            return Math.max(node.left != null ? 1 + dfs(node.left, "RIGHT") : 0, dfs(node.left, "LEFT"));
        } else {
            return Math.max(node.right != null ? 1 + dfs(node.right, "LEFT") : 0, dfs(node.right, "RIGHT"));
        }
    }
}
