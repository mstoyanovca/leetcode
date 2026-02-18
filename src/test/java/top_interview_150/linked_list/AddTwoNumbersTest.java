package top_interview_150.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {
    @Test
    public void example1Test() {
        assertEquals(
                new ListNode(7, new ListNode(0, new ListNode(8))),
                new AddTwoNumbers().addTwoNumbers(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4)))
                ));
    }

    @Test
    public void example2Test() {
        assertEquals(new ListNode(0), new AddTwoNumbers().addTwoNumbers(new ListNode(0), new ListNode(0)));
    }

    @Test
    public void example3Test() {
        assertEquals(
                new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1)))))))),
                new AddTwoNumbers().addTwoNumbers(
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
                ));
    }
}
