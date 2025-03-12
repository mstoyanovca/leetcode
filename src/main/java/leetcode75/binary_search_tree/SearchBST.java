package leetcode75.binary_search_tree;

import leetcode75.binary_tree_dfs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// problem 41;
// Binary Search Tree (BST);
public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node.val == val) return node;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        return null;
    }
}
