package top_interview_150.linked_list;

public class RotateList {
    ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = 0;
        ListNode left = head;
        ListNode right = head;

        while (right != null) {
            length++;
            right = right.next;
        }
        right = head;
        if (k == length) {
            return head;
        } else if (k > length) {
            k = k % length;
        }

        for (int i = 0; i < k; i++) right = right.next;
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }

        right.next = head;
        head = left.next;
        left.next = null;

        return head;
    }
}
