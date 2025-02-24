package leetcode75.linked_list;

// problem 30
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode firstEven = head.next;

        while (even.next != null && even.next.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        if (odd.next != null && odd.next.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
        }

        odd.next = firstEven;
        even.next = null;

        return head;
    }
}
