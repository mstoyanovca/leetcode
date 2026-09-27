package leet_code_75.linked_list;

public class DeleteMiddleNodeOfLinkedList {
    ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        ListNode previous = head;

        while (fastPointer.next != null && fastPointer.next.next != null) {
            previous = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        if (fastPointer.next != null) {
            // odd number of elements:
            slowPointer.next = slowPointer.next.next;
        } else {
            // even number of elements, slow is previous:
            previous.next = slowPointer.next;
        }

        return head;
    }
}
