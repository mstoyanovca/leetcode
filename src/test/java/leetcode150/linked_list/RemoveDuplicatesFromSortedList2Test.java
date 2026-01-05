package leetcode150.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveDuplicatesFromSortedList2Test {
    @Test
    public void example1Test() {
        assertEquals(
                new ListNode(1, new ListNode(2, new ListNode(5))),
                new RemoveDuplicatesFromSortedList2().deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5))))))))
        );
    }

    @Test
    public void example2Test() {
        assertEquals(
                new ListNode(2, new ListNode(3)),
                new RemoveDuplicatesFromSortedList2().deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3))))))
        );
    }

    @Test
    public void example3Test() {
        assertNull(new RemoveDuplicatesFromSortedList2().deleteDuplicates(new ListNode(1, new ListNode(1))));
    }
}
