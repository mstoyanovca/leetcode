package top_interview_150.binary_tree;

public class PathSum {
    boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        // it is a leaf:
        if (root.left == null && root.right == null) return root.val == targetSum;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
