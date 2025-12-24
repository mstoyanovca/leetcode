package leetcode150.linked_list;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode left = head;
        ListNode right = head;

        while (right.next != null) {
            if (right.next.val >= x) {
                right = right.next;
            } else {
                ListNode temp = left.next;
                left.next = right.next;
                right.next = right.next.next;
                left.next.next = temp;
                left = left.next;
            }
        }

        return head;
    }
}
