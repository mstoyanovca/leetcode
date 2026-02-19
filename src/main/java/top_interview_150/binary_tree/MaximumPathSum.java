package top_interview_150.binary_tree;

public class MaximumPathSum {
    private int result = Integer.MIN_VALUE;

    int maxPathSum(TreeNode root) {
        maxPathSumUtil(root);
        return result;
    }

    private int maxPathSumUtil(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(maxPathSumUtil(root.left), 0);
        int right = Math.max(maxPathSumUtil(root.right), 0);

        result = Math.max(result, root.val + left + right);

        return root.val + Math.max(left, right);
    }
}
