package top_interview_150.bst;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifference {
    TreeNode previous = null;
    TreeNode current = null;
    int result = Integer.MAX_VALUE;

    // I assume:
    // time complexity O(n)
    // space complexity O(n)
    // this solution provides space complexity O(n), but it's more intuitive;
    // this problem asks for the inorder list of the tree;
    int getMinimumDifference(TreeNode root) {
        List<TreeNode> inorder = new ArrayList<>();
        buildInorderList(root, inorder);
        for (int i = 1; i < inorder.size(); i++) result = Math.min(result, inorder.get(i).val - inorder.get(i - 1).val);

        return result;
    }

    // inorder = left - root - right
    private void buildInorderList(TreeNode root, List<TreeNode> inorder) {
        if (root == null) {
            return;
        }

        buildInorderList(root.left, inorder);
        inorder.add(root);
        buildInorderList(root.right, inorder);
    }


    // I assume:
    // time complexity O(n)
    // space complexity O(1)
    int getMinimumDifference2(TreeNode root) {
        if (root == null) return 0;

        getMinimumDifference(root.left);

        previous = current;
        current = root;
        if (previous != null) result = Math.min(result, current.val - previous.val);

        getMinimumDifference(root.right);

        return result;
    }
}
