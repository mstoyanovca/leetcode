package leetcode75.binary_tree_dfs;

// problem 37:
public class LongestZigZagPath {
    private int maxSteps = 0;

    public int longestZigZag(TreeNode root) {
        return Math.max(dfs(root, "LEFT", 0), dfs(root, "RIGHT", 0));
    }

    private int dfs(TreeNode node, String direction, int currentSteps) {
        if (node == null) return 0;
        maxSteps = Math.max(maxSteps, currentSteps);
        if (direction.equals("LEFT")) {
            dfs(node.left, "RIGHT", currentSteps + 1);
            // it might be a root of a new path:
            dfs(node.left, "LEFT", 0);
        } else {
            dfs(node.right, "LEFT", currentSteps + 1);
            // it might be a root of a new path:
            dfs(node.right, "RIGHT", 0);
        }

        return maxSteps;
    }
}
