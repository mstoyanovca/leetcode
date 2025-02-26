package leetcode75.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedListTest {
    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void example1() {
        ListNode node4_arg = new ListNode(5);
        ListNode node3_arg = new ListNode(4, node4_arg);
        ListNode node2_arg = new ListNode(3, node3_arg);
        ListNode node1_arg = new ListNode(2, node2_arg);
        ListNode node0_arg = new ListNode(1, node1_arg);

        ListNode node4_res = new ListNode(1);
        ListNode node3_res = new ListNode(2, node4_res);
        ListNode node2_res = new ListNode(3, node3_res);
        ListNode node1_res = new ListNode(4, node2_res);
        ListNode node0_res = new ListNode(5, node1_res);

        assertEquals(node0_res, reverseLinkedList.reverseList(node0_arg));
    }

    @Test
    void example2() {
        ListNode node1_arg = new ListNode(2);
        ListNode node0_arg = new ListNode(1, node1_arg);

        ListNode node1_res = new ListNode(1);
        ListNode node0_res = new ListNode(2, node1_res);

        assertEquals(node0_res, reverseLinkedList.reverseList(node0_arg));
    }

    @Test
    void example3() {
        assertNull(reverseLinkedList.reverseList(null));
    }
}
