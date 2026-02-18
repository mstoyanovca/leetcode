package top_interview_150.divide_conquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeKSortedListsTest {
    @Test
    public void example1Test() {
        ListNode node0 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode node1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode node2 = new ListNode(2, new ListNode(6));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));

        assertEquals(expected, new MergeKSortedLists().mergeKLists(new ListNode[]{node0, node1, node2}));
    }

    @Test
    public void example2Test() {
        assertEquals(null, new MergeKSortedLists().mergeKLists(null));
    }

    @Test
    public void example3Test() {
        assertEquals(null, new MergeKSortedLists().mergeKLists(new ListNode[]{}));
    }
}
