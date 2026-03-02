package top_interview_150.linked_list;

public class RemoveDuplicatesFromSortedList2 {
    ListNode deleteDuplicates(ListNode head) {
        ListNode previous = new ListNode();
        previous.next = head;
        ListNode result = previous;

        while (head != null && head.next != null) {
            if (head.val != head.next.val) {
                previous = head;
                head = head.next;
            } else {
                int duplicate = head.val;
                while (head != null && head.val == duplicate) {
                    head = head.next;
                }
                previous.next = head;
            }
        }

        return result.next;
    }
}
