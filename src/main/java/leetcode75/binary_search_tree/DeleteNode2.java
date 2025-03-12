package leetcode75.binary_search_tree;

import leetcode75.binary_tree_dfs.TreeNode;

public class DeleteNode2 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                // in order successor, the left most leaf in the right subtree:
                TreeNode ios = root.right;
                while (ios.left != null) ios = ios.left;
                root.val = ios.val;
                root.right = deleteNode(root.right, ios.val);
            }
        }

        return root;
    }
}
