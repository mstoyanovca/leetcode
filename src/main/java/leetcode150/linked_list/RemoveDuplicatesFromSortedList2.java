package leetcode150.linked_list;

public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode previous = new ListNode(0, head);
        ListNode result = previous;

        while (head != null) {
            if (head.val == head.next.val) {

            }
        }


        return result.next;
    }
}
