package top_interview_150.linked_list;

public class RemoveNthNodeFromEndOfList {
    ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode left = head;
        ListNode right = head;

        for (int i = 0; i < n; i++) right = right.next;
        if (right == null) return head.next;

        while (right.next != null) {
            left = left.next;
            right = right.next;
        }

        // left is the node to remove:
        left.next = left.next.next;

        return head;
    }
}
