package leetcode150.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateListTest {
    @Test
    public void example1Test() {
        assertEquals(
                new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(2, new ListNode(3))))),
                new RotateList().rotateRight(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                        2)
        );
    }

    @Test
    public void example2Test() {
        assertEquals(
                new ListNode(2, new ListNode(0, new ListNode(1))),
                new RotateList().rotateRight(
                        new ListNode(0, new ListNode(1, new ListNode(2))),
                        4)
        );
    }

    @Test
    public void example3Test() {
        assertEquals(new ListNode(1), new RotateList().rotateRight(new ListNode(1), 0));
    }

    @Test
    public void example4Test() {
        assertEquals(new ListNode(1), new RotateList().rotateRight(new ListNode(1), 1));
    }

    @Test
    public void example5Test() {
        assertEquals(new ListNode(1, new ListNode(2)), new RotateList().rotateRight(new ListNode(1, new ListNode(2)), 2));
    }

    @Test
    public void example6Test() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        assertEquals(head, new RotateList().rotateRight(head, 10));
    }
}
