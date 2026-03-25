package dsa_summary.linked_list;

public class ReverseLinkedList {
    ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
