package leetcode75.linked_list;

import java.util.Objects;

// problem 29
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

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}
