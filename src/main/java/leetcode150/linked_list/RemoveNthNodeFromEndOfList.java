package leetcode150.linked_list;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;

        for (int i = 0; i < n - 1; i++) right = right.next;

        while (right.next.next != null) {
            left = left.next;
            right = right.next;
        }

        ListNode previous = left;
        // left is the node to remove:
        left = left.next;
        previous.next = left.next;

        return head;
    }
}
