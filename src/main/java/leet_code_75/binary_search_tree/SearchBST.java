package leet_code_75.binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

// problem 41;
public class SearchBST {
    TreeNode searchBST(TreeNode root, int val) {
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
