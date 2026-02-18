package leet_code_75.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTwinSumOfLinkedListTest {
    private final MaximumTwinSumOfLinkedList maximumTwinSum = new MaximumTwinSumOfLinkedList();

    @Test
    void example1() {
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(4, node2);
        ListNode node0 = new ListNode(5, node1);

        assertEquals(6, maximumTwinSum.pairSum(node0));
    }

    @Test
    void example2() {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode node0 = new ListNode(4, node1);

        assertEquals(7, maximumTwinSum.pairSum(node0));
    }

    @Test
    void example3() {
        ListNode node1 = new ListNode(100000);
        ListNode node0 = new ListNode(1, node1);

        assertEquals(100001, maximumTwinSum.pairSum(node0));
    }
}
