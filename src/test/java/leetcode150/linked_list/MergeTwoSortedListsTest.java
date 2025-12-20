package leetcode150.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoSortedListsTest {
    @Test
    public void example1Test() {
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        assertEquals(expected, new MergeTwoSortedLists().mergeTwoLists(list1, list2));
    }

    @Test
    public void example2Test() {
        assertNull(new MergeTwoSortedLists().mergeTwoLists(null, null));
    }

    @Test
    public void example3Test() {
        assertEquals(new ListNode(0), new MergeTwoSortedLists().mergeTwoLists(null, new ListNode(0)));
    }

    @Test
    public void example4Test() {
        assertEquals(new ListNode(1), new MergeTwoSortedLists().mergeTwoLists(new ListNode(1), null));
    }
}
