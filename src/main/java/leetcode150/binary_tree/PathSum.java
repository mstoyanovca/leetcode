package leetcode150.binary_tree;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        return sum(root, 0, targetSum);
    }

    private boolean sum(TreeNode root, int acc, int target) {
        if (root.left == null && root.right == null) {
            // it is a leaf:
            acc += root.val;
            if (acc == target) return true;
        }
        if (root.left != null) {
            acc += root.val;
            return sum(root.left, acc, target);
        }
        if (root.right != null) {
            acc += root.val;
            return sum(root.right, acc, target);
        }
        return false;
    }
}
