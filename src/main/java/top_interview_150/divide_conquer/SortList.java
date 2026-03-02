package top_interview_150.divide_conquer;

public class SortList {
    // merge sort algorithm, uses the divide-and-conquer approach
    // O(n * log(n)) time complexity
    // O(1) space complexity
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(middle);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode result = new ListNode();
        ListNode current = result;

        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        current.next = left != null ? left : right;

        return result.next;
    }
}
