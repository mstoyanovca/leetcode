package leetcode150.binary_tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class PopulateNextRightPointersEachNode2 {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                size--;
                Node current = queue.remove();
                if (size > 0) current.next = queue.element();
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }

        return root;
    }
}
