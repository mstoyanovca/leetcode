package leetcode150.linked_list;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> oldToNew = new HashMap<>();
        Node result = new Node(head.val);
        Node resultHead = result;

        Node temp = head;
        while (temp.next != null) {
            result.next = new Node(temp.next.val);
            result = result.next;
            temp = temp.next;
        }

        temp = head;
        result = resultHead;
        while (temp.next != null) {
            Node next = temp.next;
            temp.next = result;
            result.next = next;
            temp = next;
            int x = 0;
        }

        return resultHead;
    }
}
