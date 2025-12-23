package leetcode150.linked_list;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode left = head;
        ListNode right = head;
        int length = 0;

        while (right != null) {
            length++;
            right = right.next;
        }
        right = head;
        if (k == length) return head;
        if (k > length) k = k % length;
        if (k == 0) return head;

        for (int i = 0; i < k; i++) right = right.next;
        while (right != null && right.next != null) {
            left = left.next;
            right = right.next;
        }

        ListNode temp = head;
        head = left.next;
        left.next = null;
        if (right != null) right.next = temp;

        return head;
    }
}
