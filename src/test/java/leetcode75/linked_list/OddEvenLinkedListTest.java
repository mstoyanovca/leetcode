package leetcode75.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddEvenLinkedListTest {
    private final OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

    @Test
    void example1() {
        ListNode node4_arg = new ListNode(5);
        ListNode node3_arg = new ListNode(4, node4_arg);
        ListNode node2_arg = new ListNode(3, node3_arg);
        ListNode node1_arg = new ListNode(2, node2_arg);
        ListNode node0_arg = new ListNode(1, node1_arg);

        ListNode node4_res = new ListNode(4);
        ListNode node3_res = new ListNode(2, node4_res);
        ListNode node2_res = new ListNode(5, node3_res);
        ListNode node1_res = new ListNode(3, node2_res);
        ListNode node0_res = new ListNode(1, node1_res);

        assertEquals(node0_res, oddEvenLinkedList.oddEvenList(node0_arg));
    }

    @Test
    void example2() {
        ListNode node6_arg = new ListNode(7);
        ListNode node5_arg = new ListNode(4, node6_arg);
        ListNode node4_arg = new ListNode(6, node5_arg);
        ListNode node3_arg = new ListNode(5, node4_arg);
        ListNode node2_arg = new ListNode(3, node3_arg);
        ListNode node1_arg = new ListNode(1, node2_arg);
        ListNode node0_arg = new ListNode(2, node1_arg);

        ListNode node6_res = new ListNode(4);
        ListNode node5_res = new ListNode(5, node6_res);
        ListNode node4_res = new ListNode(1, node5_res);
        ListNode node3_res = new ListNode(7, node4_res);
        ListNode node2_res = new ListNode(6, node3_res);
        ListNode node1_res = new ListNode(3, node2_res);
        ListNode node0_res = new ListNode(2, node1_res);

        assertEquals(node0_res, oddEvenLinkedList.oddEvenList(node0_arg));
    }
}
