package leetcode150.linked_list;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int overflow = 0;
        ListNode result = new ListNode();
        ListNode head = result;

        result.val = l1.val + l2.val;
        if (result.val > 9) {
            overflow = 1;
            result.val -= 10;
        }

        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            int temp = l1.val + l2.val + overflow;
            if (temp > 9) {
                temp -= 10;
                overflow = 1;
            } else {
                overflow = 0;
            }
            result.next = new ListNode();
            result.next.val = temp;
            result = result.next;
        }

        return head;
    }
}
