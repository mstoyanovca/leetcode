package top_interview_150.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitionListTest {
    @Test
    public void example1Test() {
        ListNode head = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(5))))));

        assertEquals(expected, new PartitionList().partition(head, 3));
    }

    @Test
    public void example2Test() {
        ListNode head = new ListNode(2, new ListNode(1));
        ListNode expected = new ListNode(1, new ListNode(2));

        assertEquals(expected, new PartitionList().partition(head, 2));
    }

    @Test
    public void example3Test() {
        ListNode head = new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2)))));
        ListNode expected = new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(5)))));

        assertEquals(expected, new PartitionList().partition(head, 3));
    }
}
