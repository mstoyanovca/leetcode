package leetcode150.linked_list;

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // if left = 1, previous points to head:
        ListNode previous = new ListNode();
        previous.next = head;
        ListNode result = head;
        int i = 0;

        while (i < left - 1) {
            previous = head;
            head = head.next;
            i++;
        }

        while (i >= left - 1 && i < right - 1) {
            ListNode next = head.next;

            head.next = next.next;
            next.next = previous.next;
            previous.next = next;

            i++;
        }

        return result;
    }
}
