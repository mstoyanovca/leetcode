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

        currentNode = head;
        Node result = currentNode.next;
        // remove the old nodes:
        while (currentNode.next != null) {
            Node oldNode = currentNode;
            Node newNode = currentNode.next;

            oldNode.next = currentNode.next.next;
            newNode.next = currentNode.next.next.next;

            currentNode = currentNode.next.next;
        }

        return result;
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
