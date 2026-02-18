package leet_code_75.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DeleteMiddleNodeOfLinkedListTest {
    private final DeleteMiddleNodeOfLinkedList deleteMiddleNode = new DeleteMiddleNodeOfLinkedList();

    @Test
    void example1() {
        ListNode node6_arg = new ListNode(6);
        ListNode node5_arg = new ListNode(2, node6_arg);
        ListNode node4_arg = new ListNode(1, node5_arg);
        ListNode node3_arg = new ListNode(7, node4_arg);
        ListNode node2_arg = new ListNode(4, node3_arg);
        ListNode node1_arg = new ListNode(3, node2_arg);
        ListNode node0_arg = new ListNode(1, node1_arg);

        ListNode node5_res = new ListNode(6);
        ListNode node4_res = new ListNode(2, node5_res);
        ListNode node3_res = new ListNode(1, node4_res);
        ListNode node2_res = new ListNode(4, node3_res);
        ListNode node1_res = new ListNode(3, node2_res);
        ListNode node0_res = new ListNode(1, node1_res);

        assertEquals(node0_res, deleteMiddleNode.deleteMiddle(node0_arg));
    }

    @Test
    void example2() {
        ListNode node3_arg = new ListNode(4);
        ListNode node2_arg = new ListNode(3, node3_arg);
        ListNode node1_arg = new ListNode(2, node2_arg);
        ListNode node0_arg = new ListNode(1, node1_arg);

        ListNode node2_res = new ListNode(4);
        ListNode node1_res = new ListNode(2, node2_res);
        ListNode node0_res = new ListNode(1, node1_res);

        assertEquals(node0_res, deleteMiddleNode.deleteMiddle(node0_arg));
    }

    @Test
    void example3() {
        ListNode node1_arg = new ListNode(1);
        ListNode node0_arg = new ListNode(2, node1_arg);

        ListNode node0_res = new ListNode(2);

        assertEquals(node0_res, deleteMiddleNode.deleteMiddle(node0_arg));
    }

    @Test
    void example4() {
        ListNode node0_arg = new ListNode(1);

        assertNull(deleteMiddleNode.deleteMiddle(node0_arg));
    }
}
