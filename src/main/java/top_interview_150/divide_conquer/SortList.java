package top_interview_150.divide_conquer;

public class SortList {
    // merge sort algorithm, uses the divide-and-conquer approach
    // O(n*log(n)) time complexity
    // O(1) space complexity
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;
        // find the middle:
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // split:
        ListNode middle = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(middle);

        return merge(left, right);
    }

    private ListNode merge(ListNode listNode1, ListNode listNode2) {
        ListNode current = new ListNode(0);
        ListNode tail = current;

        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val < listNode2.val) {
                tail.next = listNode1;
                listNode1 = listNode1.next;
            } else {
                tail.next = listNode2;
                listNode2 = listNode2.next;
            }
            tail = tail.next;
        }

        tail.next = (listNode1 != null) ? listNode1 : listNode2;
        return current.next;
    }
}
