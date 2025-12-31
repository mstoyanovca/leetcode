package leetcode150.binary_tree_bfs;

import leetcode150.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    List<Integer> list = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return list;

        queue.add(root);
        list.add(root.val);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                size--;
                TreeNode current = queue.remove();
                if (current.right != null) {
                    queue.add(current.right);
                    list.add(current.right.val);
                } else if (current.left != null) {
                    queue.add(current.left);
                    list.add(current.left.val);
                }
            }
        }

        return list;
    }
}
