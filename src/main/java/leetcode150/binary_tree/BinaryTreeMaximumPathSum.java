package leetcode150.binary_tree;

public class BinaryTreeMaximumPathSum {
    private int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumUtil(root);
        return result;
    }

    public int maxPathSumUtil(TreeNode root) {
        if (root == null) return 0;

        int left = maxPathSumUtil(root.left);
        int right = maxPathSumUtil(root.right);
        // find the MAX of root, root + left, root + right and root + left + right:
        int tempSum = Math.max(Math.max(root.val, root.val + Math.max(left, right)), root.val + left + right);

        result = Math.max(result, tempSum);

        return tempSum;
    }
}
