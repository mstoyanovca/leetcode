package top_interview_150.linked_list;

public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(101, head);
        ListNode previous = result;

        while (head != null && head.next != null) {
            if (head.val != head.next.val) {
                previous = head;
                head = head.next;
            } else {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                head = head.next;
                previous.next = head;
            }
        }

        return result.next;
    }
}
