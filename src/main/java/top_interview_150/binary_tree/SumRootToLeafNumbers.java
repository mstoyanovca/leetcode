package top_interview_150.binary_tree;

public class SumRootToLeafNumbers {
    int sumNumbers(TreeNode root) {
        return sumNumbersUtil(root, 0);
    }

    private int sumNumbersUtil(TreeNode root, int acc) {
        if (root == null) return 0;
        acc = 10 * acc + root.val;
        if (root.left == null && root.right == null) return acc;

        return sumNumbersUtil(root.left, acc) + sumNumbersUtil(root.right, acc);
    }
}
