package top_interview_150.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycleTest {
    @Test
    public void example1Test() {
        ListNode node0 = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        assertTrue(new LinkedListCycle().hasCycle(node0));
    }

    @Test
    public void example2Test() {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);

        node0.next = node1;
        node1.next = node0;

        assertTrue(new LinkedListCycle().hasCycle(node0));
    }

    @Test
    public void example3Test() {
        assertFalse(new LinkedListCycle().hasCycle(new ListNode(1)));
    }
}
