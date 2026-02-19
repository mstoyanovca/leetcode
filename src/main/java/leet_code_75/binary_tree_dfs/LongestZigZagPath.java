package leet_code_75.binary_tree_dfs;

// problem 37;
// leetcode website doesn't recognize enumerations, that's why the constants;
public class LongestZigZagPath {
    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";

    int longestZigZag(TreeNode root) {
        return Math.max(dfs(root, LEFT, 0), dfs(root, RIGHT, 0));
    }

    private int dfs(TreeNode node, String direction, int currentSteps) {
        if (node == null) return 0;
        if (direction.equals(LEFT)) {
            return Math.max(
                    Math.max(
                            dfs(node.left, RIGHT, currentSteps + 1),
                            // it might be a root of a new path:
                            dfs(node.left, LEFT, 0)),
                    currentSteps);
        } else {
            return Math.max(
                    Math.max(
                            dfs(node.right, LEFT, currentSteps + 1),
                            // it might be a root of a new path:
                            dfs(node.right, RIGHT, 0)),
                    currentSteps);
        }
    }
}
