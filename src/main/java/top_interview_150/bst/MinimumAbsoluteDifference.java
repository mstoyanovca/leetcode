package top_interview_150.bst;

public class MinimumAbsoluteDifference {
    int result = Integer.MAX_VALUE;
    int previous = -1;
    int current = -1;


    int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;

        getMinimumDifference(root.left);
        previous = current;
        current = root.val;
        if (previous != -1 && current != -1) result = Math.min(result, current - previous);
        getMinimumDifference(root.right);

        return result;
    }
}
