package top_interview_150.divide_conquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortListTest {
    @Test
    public void example1Test() {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        assertEquals(expected, new SortList().sortList(head));
    }

    @Test
    public void example2Test() {
        ListNode head = new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))));
        ListNode expected = new ListNode(-1, new ListNode(0, new ListNode(3, new ListNode(4, new ListNode(5)))));

        assertEquals(expected, new SortList().sortList(head));
    }
}
