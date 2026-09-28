package leet_code_75.linked_list;

public class MaximumTwinSumOfLinkedList {
    int pairSum(ListNode head) {
        // length is always even:
        int maxIndex = 0;
        ListNode current = head;
        int maxTwinSum = 0;

        // find the max index:
        while (current.next != null) {
            maxIndex++;
            current = current.next;
        }

        // split the list into two:
        current = head;
        for (int i = 0; i < maxIndex / 2; i++) {
            current = current.next;
        }
        ListNode head2 = current.next;
        current.next = null;

        if (head.next == null || head2.next == null) return head.val + head2.val;

        // reverse the second list:
        ListNode previous = head2;
        current = head2.next;
        head2.next = null;
        ListNode next;
        while (current.next != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        current.next = previous;
        head2 = current;

        // find maxSum:
        ListNode current1 = head;
        ListNode current2 = head2;
        for (int i = 0; i <= maxIndex / 2; i++) {
            maxTwinSum = Math.max(maxTwinSum, current1.val + current2.val);
            current1 = current1.next;
            current2 = current2.next;
        }

        return maxTwinSum;
    }
}
