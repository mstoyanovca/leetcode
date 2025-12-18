package leetcode150.linked_list;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int overflow = 0;
        ListNode result = new ListNode();
        ListNode head = result;

        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + overflow;
            if (temp > 9) {
                temp -= 10;
                overflow = 1;
            } else {
                overflow = 0;
            }
            result.val = temp;

            if (l1.next != null && l2.next != null) {
                result.next = new ListNode();
                result = result.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        return head;
    }
}
