package top_interview_150.linked_list;

public class AddTwoNumbers {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int overflow = 0;
        ListNode current = new ListNode();
        ListNode head = current;

        while (l1 != null || l2 != null || overflow > 0) {
            current.val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + overflow;
            overflow = current.val / 10;
            current.val %= 10;

            if (l1 != null && l1.next != null || l2 != null && l2.next != null || overflow > 0) {
                current.next = new ListNode();
                current = current.next;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return head;
    }
}
