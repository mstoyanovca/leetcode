package leetcode150.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLinkedList2Test {
    @Test
    public void example1Test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));

        assertEquals(expected, new ReverseLinkedList2().reverseBetween(head, 2, 4));
    }

    @Test
    public void example2Test() {
        assertEquals(new ListNode(5), new ReverseLinkedList2().reverseBetween(new ListNode(5), 1, 1));
    }
}
