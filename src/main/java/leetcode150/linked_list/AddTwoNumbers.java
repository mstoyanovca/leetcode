package leetcode150.linked_list;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int overflow = 0;
        ListNode result = new ListNode();
        ListNode head = result;

        while (l1 != null || l2 != null || overflow > 0) {
            result.val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + overflow;
            if (result.val > 9) {
                result.val -= 10;
                overflow = 1;
            } else {
                overflow = 0;
            }

            if (l1 != null && l1.next != null || l2 != null && l2.next != null || overflow > 0) {
                result.next = new ListNode();
                result = result.next;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return head;
    }
}
