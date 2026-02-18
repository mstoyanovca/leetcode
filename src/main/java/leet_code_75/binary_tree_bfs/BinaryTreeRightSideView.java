package leet_code_75.binary_tree_bfs;

import leet_code_75.binary_tree_dfs.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * DFS stands for Depth First Search;
 * DFS builds the tree subtree by subtree;
 * DFS uses stack data structure;
 * It works on the concept of LIFO;
 * DFS is more suitable when there are solutions away from source.
 * BFS stands for Breadth First Search;
 * BFS builds the tree level by level;
 * BFS uses Queue data structure for finding the shortest path;
 * It works on the concept of FIFO;
 * BFS is more suitable for searching vertices closer to the given source;
 */
public class BinaryTreeRightSideView {
    // problem 39, Queue/FIFO:
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.remove();
                if (i == 0) result.add(node.val);
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }

        return result;
    }

    // problem 39, recursive:
    public List<Integer> rightSideViewRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        bfs(root, result, 0);
        return result;
    }

    private void bfs(TreeNode node, List<Integer> result, int level) {
        if (node == null) return;
        if (result.size() == level) result.add(node.val);
        bfs(node.right, result, level + 1);
        bfs(node.left, result, level + 1);
    }
}
