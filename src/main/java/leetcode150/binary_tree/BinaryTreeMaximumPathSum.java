package leetcode150.binary_tree;

public class BinaryTreeMaximumPathSum {
    int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumUtil(root);
        return result;
    }

    private int maxPathSumUtil(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(0, maxPathSum(root.left));
        int right = Math.max(0, maxPathSum(root.right));
        int tempSum = root.val + left + right;
        result = Math.max(result, tempSum);

        return root.val + Math.max(left, right);
    }
}
