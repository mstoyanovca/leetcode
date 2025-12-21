package leetcode150.linked_list;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        // I assume:
        // time complexity O(n)
        // space complexity O(n)
        Node currentNode = head;
        while (currentNode != null) {
            // interweaving algorithm: A -> A' -> B -> B' -> C -> C' -> D -> D'
            Node newNode = new Node(currentNode.val);
            newNode.next = currentNode.next;
            currentNode.next = newNode;

            currentNode = newNode.next;
        }

        currentNode = head;
        // set up the random pointers:
        while (currentNode != null) {
            Node currentNewNode = currentNode.next;
            if (currentNode.random != null) currentNewNode.random = currentNode.random.next;

            currentNode = currentNewNode.next;
        }

        Node oldHead = head;
        Node newHead = head.next;
        Node oldNode = oldHead;
        Node newNode = newHead;
        // split the old and new linked lists:
        while (oldNode != null) {
            oldNode.next = oldNode.next.next;
            newNode.next = newNode.next != null ? newNode.next.next : null;
            oldNode = oldNode.next;
            newNode = newNode.next;
        }

        return newHead;
    }

    public Node copyRandomList2(Node head) {
        Map<Node, Node> oldNodeToNewNode = new HashMap<>();

        // I assume:
        // time complexity O(n)
        // space complexity O(n)
        Node temp = head;
        while (temp != null) {
            oldNodeToNewNode.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            oldNodeToNewNode.get(temp).next = oldNodeToNewNode.get(temp.next);
            oldNodeToNewNode.get(temp).random = oldNodeToNewNode.get(temp.random);
            temp = temp.next;
        }

        return oldNodeToNewNode.get(head);
    }
}
