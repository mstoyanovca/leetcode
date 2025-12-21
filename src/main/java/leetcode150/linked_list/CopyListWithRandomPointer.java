package leetcode150.linked_list;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

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
            result.next = new Node(temp.next.val);
            result = result.next;
            temp = temp.next;
        }

        return resultHead;
    }
}
