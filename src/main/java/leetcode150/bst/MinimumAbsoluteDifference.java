package leetcode150.bst;

import leetcode150.binary_tree.TreeNode;

public class MinimumAbsoluteDifference {
    int result = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        //if (root == null) return 0;

        if (root.left != null) {
            getMinimumDifference(root.left);
            result = Math.min(result, root.val - root.left.val);
        }
        if (root.right != null) {
            getMinimumDifference(root.right);
            result = Math.min(result, root.val - root.right.val);
        }

        return result;
    }
}
