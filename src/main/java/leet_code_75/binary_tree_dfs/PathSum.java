package leet_code_75.binary_tree_dfs;

public class PathSum {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return dfs(root, 0, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private int dfs(TreeNode node, long currentSum, int targetSum) {
        if (node == null) return 0;
        currentSum += node.val;
        return (currentSum == targetSum ? 1 : 0) + dfs(node.left, currentSum, targetSum) + dfs(node.right, currentSum, targetSum);
    }
}
