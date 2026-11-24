package top_interview_150.linked_list;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    Node copyRandomList(Node head) {
        if (head == null) return null;

        Node current = head;
        while (current != null) {
            // interweaving the new nodes with the existing ones:
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;

            current = current.next.next;
        }

        current = head;
        while (current != null) {
            current.next.random = current.random != null ? current.random.next : null;
            current = current.next.next;
        }

        current = head;
        Node result = head.next;
        while (current != null) {
            Node copy = current.next;
            current.next = current.next.next;
            copy.next = current.next != null ? current.next.next : null;

            current = current.next;
        }

        return result;
    }

    Node copyRandomList2(Node head) {
        Map<Node, Node> oldNodeToNewNode = new HashMap<>();

        // I assume:
        // time complexity O(n)
        // space complexity O(n)
        Node current = head;
        while (current != null) {
            oldNodeToNewNode.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;
        while (current != null) {
            oldNodeToNewNode.get(current).next = oldNodeToNewNode.get(current.next);
            oldNodeToNewNode.get(current).random = oldNodeToNewNode.get(current.random);
            current = current.next;
        }

        return oldNodeToNewNode.get(head);
    }
}
