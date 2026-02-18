package top_interview_150.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void example1Test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));

        assertEquals(expected, new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 2));
    }

    @Test
    public void example2Test() {
        assertNull(new RemoveNthNodeFromEndOfList().removeNthFromEnd(new ListNode(1), 1));
    }

    @Test
    public void example3Test() {
        assertEquals(new ListNode(1), new RemoveNthNodeFromEndOfList().removeNthFromEnd(new ListNode(1, new ListNode(2)), 1));
    }

    @Test
    public void example4Test() {
        assertEquals(new ListNode(2), new RemoveNthNodeFromEndOfList().removeNthFromEnd(new ListNode(1, new ListNode(2)), 2));
    }
}
