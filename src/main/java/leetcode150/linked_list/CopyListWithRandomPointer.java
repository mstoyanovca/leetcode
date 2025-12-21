package leetcode150.linked_list;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldNodeToNewNode = new HashMap<>();

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

    public Node copyRandomList2(Node head) {
        Map<Node, Node> oldNodeToNewNode = new HashMap<>();

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
