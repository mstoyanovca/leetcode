package leetcode150.linked_list;

public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(101, head);
        ListNode previous = result;

        while (head != null) {
            if (head.next != null && head.val != head.next.val && head.next.val != previous.next.val) {
                previous = head;
                previous.next = head.next;
                head = head.next;
                int x = 0;
            } else {
                head = head.next;
                int x = 0;
            }
            int x = 0;
        }


        return result.next;
    }
}
