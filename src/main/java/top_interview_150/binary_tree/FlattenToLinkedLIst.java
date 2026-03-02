package top_interview_150.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class FlattenToLinkedLIst {
    private TreeNode previous = null;

    // time complexity O(n)
    // space complexity O(n)
    // the problem is asking for the preorder list of the tree;
    // this solution has O(n) space complexity, but it is more intuitive;
    void flatten(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        preorder(root, nodes);

        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).left = null;
            nodes.get(i).right = nodes.get(i + 1);
        }
    }

    private void preorder(TreeNode root, List<TreeNode> nodes) {
        if (root == null) return;

        // preorder: root - left - right
        nodes.add(root);
        preorder(root.left, nodes);
        preorder(root.right, nodes);
    }

    // time complexity O(n)
    // space complexity O(1)
    void flatten2(TreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.left = null;
        root.right = previous;
        previous = root;
    }
}
