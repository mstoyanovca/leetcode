package dsa_summary.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLinkedListTest {
    @Test
    public void example1Test() {
        assertEquals(
                new ListNode(3, new ListNode(2, new ListNode(1))),
                new ReverseLinkedList().reverse(new ListNode(1, new ListNode(2, new ListNode(3))))
        );
    }
}
