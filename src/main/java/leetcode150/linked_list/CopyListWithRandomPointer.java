package leetcode150.linked_list;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node result = new Node(head.val);
        Node resultHead = result;

        // an example of interweave algorithm:
        while (head.next != null) {
            result.next = new Node(head.next.val);

            Node temp = head;

            result = result.next;
            head = head.next;
        }

        return resultHead;
    }
}
