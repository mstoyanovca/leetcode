package leetcode150.linked_list;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int overflow = 0;
        ListNode result = new ListNode();

        result.val = l1.val + l2.val;
        if (result.val > 9) {
            overflow = 1;
            result.val -= 10;
        }

        ListNode previous = result;
        while (l1.next != null && l2.next != null) {
            ListNode node1 = l1.next;
            ListNode node2 = l2.next;
            ListNode next = new ListNode();
            previous.next = next;
            //previous = next;
            next.val = node1.val + node2.val + overflow;
            if (next.val > 9) {
                overflow = 1;
                next.val -= 10;
            } else {
                overflow = 0;
            }
        }

        return result;
    }
}
