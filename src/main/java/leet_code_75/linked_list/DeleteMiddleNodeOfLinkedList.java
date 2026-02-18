package leet_code_75.linked_list;

// problem 29:
public class DeleteMiddleNodeOfLinkedList {
    public ListNode deleteMiddle(ListNode head) {
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
            // even number elements, slow is previous:
            slowPointer.next = slowPointer.next.next;
        } else {
            // odd number elements:
            previous.next = slowPointer.next;
        }

        return head;
    }
}
