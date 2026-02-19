package top_interview_150.linked_list;

public class PartitionList {
    ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode left = new ListNode(101, head);
        ListNode result = left;
        ListNode right = new ListNode(101, head);

        // stop the left pointer just before un uphill:
        while (left.next != null && left.next.val < x) {
            left = left.next;
            right = right.next;
        }
        // stop the right pointer just before a downhill:
        while (right.next != null && right.next.val >= x) right = right.next;

        while (right.next != null) {
            if (left.next != null && left.next.val < x) {
                // move the left pointer after swapping:
                left = left.next;
            } else if (right.next.val >= x) {
                // move the right pointer after swapping:
                right = right.next;
            } else {
                // swap nodes:
                ListNode temp = left.next;
                left.next = right.next;
                right.next = right.next.next;
                left.next.next = temp;
            }
        }

        return result.next;
    }
}
