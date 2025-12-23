package leetcode150.linked_list;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(0, head);
        ListNode previous = result;
        int length = 0;
        int count = 0;

        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // time complexity O(n)
        // space complexity O(1)
        while (head != null) {
            int i = 0;
            while (i < k - 1 && head.next != null) {
                ListNode next = head.next;

                head.next = head.next.next;
                next.next = previous.next;
                previous.next = next;

                i++;
            }

            count += k;
            if (length - count < k) break;

            previous = head;
            head = head.next;
        }

        return result.next;
    }
}
