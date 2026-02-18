package leet_code_75.binary_search_tree;

import leet_code_75.binary_tree_dfs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// problem 42:
public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (key < node.val) {
                if (node.left != null) queue.add(node.left);
            } else if (key > node.val) {
                if (node.right != null) queue.add(node.right);
            } else {
                if (node.left == null && node.right == null) {
                    return null;
                } else if (node.left == null) {
                    return node.right;
                } else if (node.right == null) {
                    return node.left;
                } else {
                    TreeNode ios = node.right;
                    while (ios.left != null) ios = ios.left;
                    node.val = ios.val;
                    return root;
                }
            }
        }

        return root;
    }

    private TreeNode deleteRoot(TreeNode root) {
        TreeNode rootLeft = root.left;
        TreeNode rootRight = root.right;

        TreeNode newRootParent = root;
        TreeNode newRoot = root;
        while (newRoot.right != null && newRoot.left != null) {
            // find the inorder successor of the root node (the left most leaf in the right subtree):
            newRootParent = newRoot.right;
            newRoot = newRootParent.left;
        }
        newRootParent.left = null;
        newRoot.left = rootLeft;
        newRoot.right = rootRight;
        return newRoot;
    }

    private void deleteLeftChild(TreeNode parent, TreeNode leftChild) {
        if (leftChild.left == null && leftChild.right == null) {
            // a leaf node:
            parent.left = null;
        } else if (leftChild.left != null && leftChild.right != null) {
            parent.left = leftChild.right;
            leftChild.right.left = leftChild.left;
        } else if (leftChild.left != null) {
            parent.left = leftChild.left;
        } else {
            // leftChild.right != null
            parent.left = leftChild.right;
        }
    }

    private void deleteRightChild(TreeNode parent, TreeNode rightChild) {
        if (rightChild.left == null && rightChild.right == null) {
            // a leaf node:
            parent.right = null;
        } else if (rightChild.left != null && rightChild.right != null) {
            parent.right = rightChild.left;
            rightChild.left.right = rightChild.right;
        } else if (rightChild.left != null) {
            parent.right = rightChild.left;
        } else {
            // leftChild.right != null
            parent.right = rightChild.right;
        }
    }
}
