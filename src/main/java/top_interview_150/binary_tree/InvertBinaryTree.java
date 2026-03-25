package top_interview_150.binary_tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class InvertBinaryTree {
    // DFS with a dequeue;
    // time complexity O(n)
    // space complexity O(n)
    TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Deque<TreeNode> dequeue = new ArrayDeque<>();
        dequeue.add(root);

        while (!dequeue.isEmpty()) {
            TreeNode node = dequeue.removeLast();

            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if (node.left != null) {
                dequeue.add(node.left);
            }
            if (node.right != null) {
                dequeue.add(node.right);
            }
        }

        return root;
    }

    // DFS with recursion;
    // time complexity O(n)
    // space complexity O(1)
    TreeNode invertTreeRecursive(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
