package top_interview_150.bst;

public class ValidateBst {
    private Long min = Long.MIN_VALUE;

    boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        boolean left = isValidBST(root.left);
        if (min >= root.val) return false;
        min = (long) root.val;

        boolean right = isValidBST(root.right);

        return left && right;
    }
}
