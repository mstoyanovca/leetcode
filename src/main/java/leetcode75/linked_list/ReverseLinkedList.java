package leetcode75.linked_list;

// problem 31:
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode previous = head;
        ListNode current = head.next;
        head.next = null;
        ListNode next;

        while (current.next != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        current.next = previous;
        head = current;

        return head;
    }
}
