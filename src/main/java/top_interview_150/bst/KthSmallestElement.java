package top_interview_150.bst;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
    // this problem asks for the inorder list of the tree
    int kthSmallest(TreeNode root, int k) {
        List<TreeNode> inorderList = new ArrayList<>();
        buildInorderList(root, inorderList);
        return inorderList.get(k - 1).val;
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
}
