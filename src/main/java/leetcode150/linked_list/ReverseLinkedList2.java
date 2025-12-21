package leetcode150.linked_list;

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i = 0;
        ListNode previous = new ListNode(0);
        while (i < left - 1) {
            previous = head;
            previous.next = null;
            head = head.next;
            i++;
        }

        while (i >= left - 1 && i <= right - 1) {
            ListNode current = head;
            head.next.next = head;
            head.next = null;
            head = current;
            i++;
        }

        while (i > right - 1) {
            i++;
        }

        int x = 0;
       /* int i = 0;
        while (head != null) {
            if (i < left - 1) {
                continue;
            } else if (i == left - 1) {
                before = head;
            } else if (i == right) {

            } else {

            }


            i++;
            head = head.next;
        }*/

        return head;
    }
}
