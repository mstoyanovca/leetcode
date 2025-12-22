package leetcode150.linked_list;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode();
        result.next = head;
        ListNode previous = result;

        while (head != null && head.next != null) {
            int i = 0;
            while (i < k - 1 && head.next != null) {
                ListNode next = head.next;

                head.next = head.next.next;
                next.next = previous.next;
                previous.next = next;

                i++;
            }
            previous = head;
            head = head.next;
            int x = 0;
        }

        return result.next;
    }
}
