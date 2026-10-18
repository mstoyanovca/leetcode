package leet_code_75.linked_list;

public class DeleteMiddleNodeOfLinkedList {
    ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode previous = head;
        ListNode slow = head;
        ListNode fast = head;

        // odd number of elements:
        while (fast.next != null && fast.next.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // even number of elements:
        if (fast.next != null) {
            previous = slow;
            slow = slow.next;
        }

        previous.next = slow.next;
        slow.next = null;

        return head;
    }
}
