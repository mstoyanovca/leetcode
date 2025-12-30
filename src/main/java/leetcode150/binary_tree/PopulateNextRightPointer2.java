package leetcode150.binary_tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class PopulateNextRightPointer2 {
    public Node connect(Node root) {
        Node head = root;

        // time complexity O(n)
        // space complexity O(1)
        // outer loop, keeps track of the level
        while (head != null) {
            Node temp = new Node(101);
            Node firstNodeNextLevel = temp;

            // inner loop, keeps track of the node within a level
            while (head != null) {
                if (head.left != null) {
                    temp.next = head.left;
                    temp = head.left;
                }
                if (head.right != null) {
                    temp.next = head.right;
                    temp = head.right;
                }
                head = head.next;
            }
            head = firstNodeNextLevel.next;
        }

        return root;
    }

    public Node connect2(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        // time complexity O(n)
        // space complexity O(W)
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
