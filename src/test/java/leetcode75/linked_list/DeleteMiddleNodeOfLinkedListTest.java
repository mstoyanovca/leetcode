package leetcode75.linked_list;

import leetcode75.linked_list.DeleteMiddleNodeOfLinkedList.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteMiddleNodeOfLinkedListTest {
    private final DeleteMiddleNodeOfLinkedList deleteMiddleNode = new DeleteMiddleNodeOfLinkedList();

    @Test
    void example1() {
        ListNode node6_arg = deleteMiddleNode.new ListNode(6);
        ListNode node5_arg = deleteMiddleNode.new ListNode(2, node6_arg);
        ListNode node4_arg = deleteMiddleNode.new ListNode(1, node5_arg);
        ListNode node3_arg = deleteMiddleNode.new ListNode(7, node4_arg);
        ListNode node2_arg = deleteMiddleNode.new ListNode(4, node3_arg);
        ListNode node1_arg = deleteMiddleNode.new ListNode(3, node2_arg);
        ListNode node0_arg = deleteMiddleNode.new ListNode(1, node1_arg);

        ListNode node5_res = deleteMiddleNode.new ListNode(6);
        ListNode node4_res = deleteMiddleNode.new ListNode(2, node5_res);
        ListNode node3_res = deleteMiddleNode.new ListNode(1, node4_res);
        ListNode node2_res = deleteMiddleNode.new ListNode(4, node3_res);
        ListNode node1_res = deleteMiddleNode.new ListNode(3, node2_res);
        ListNode node0_res = deleteMiddleNode.new ListNode(1, node1_res);

        assertEquals(node0_res, deleteMiddleNode.deleteMiddle(node0_arg));
    }

    @Test
    void example2() {
        ListNode node3_arg = deleteMiddleNode.new ListNode(4);
        ListNode node2_arg = deleteMiddleNode.new ListNode(3, node3_arg);
        ListNode node1_arg = deleteMiddleNode.new ListNode(2, node2_arg);
        ListNode node0_arg = deleteMiddleNode.new ListNode(1, node1_arg);

        ListNode node2_res = deleteMiddleNode.new ListNode(4);
        ListNode node1_res = deleteMiddleNode.new ListNode(2, node2_res);
        ListNode node0_res = deleteMiddleNode.new ListNode(1, node1_res);

        assertEquals(node0_res, deleteMiddleNode.deleteMiddle(node0_arg));
    }

    @Test
    void example3() {
        ListNode node1_arg = deleteMiddleNode.new ListNode(1);
        ListNode node0_arg = deleteMiddleNode.new ListNode(2, node1_arg);

        ListNode node0_res = deleteMiddleNode.new ListNode(2);

        assertEquals(node0_res, deleteMiddleNode.deleteMiddle(node0_arg));
    }

    @Test
    void example4() {
        ListNode node0_arg = deleteMiddleNode.new ListNode(1);

        assertEquals(null, deleteMiddleNode.deleteMiddle(node0_arg));
    }
}
