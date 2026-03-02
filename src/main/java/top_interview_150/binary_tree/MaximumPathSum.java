package top_interview_150.binary_tree;

public class MaximumPathSum {
    private int result = Integer.MIN_VALUE;

    int maxPathSum(TreeNode root) {
        maxPathSumUtility(root);
        return result;
    }

    private int maxPathSumUtility(TreeNode root) {
        if (root == null) return 0;

        // if the left leaf is negative, and brings the overall sum down, ignore it:
        int left = Math.max(0, maxPathSumUtility(root.left));
        // if the right leaf is negative, and brings the overall sum down, ignore it:
        int right = Math.max(0, maxPathSumUtility(root.right));

        result = Math.max(result, root.val + left + right);

        return root.val + Math.max(left, right);
    }
}
