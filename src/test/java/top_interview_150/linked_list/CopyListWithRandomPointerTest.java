package top_interview_150.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CopyListWithRandomPointerTest {
    @Test
    public void example1Test() {
        Node input0 = new Node(7);
        Node input1 = new Node(13);
        Node input2 = new Node(11);
        Node input3 = new Node(10);
        Node input4 = new Node(1);

        input0.next = input1;
        input1.next = input2;
        input2.next = input3;
        input3.next = input4;
        input4.next = null;

        input0.random = null;
        input1.random = input0;
        input2.random = input4;
        input3.random = input2;
        input4.random = input0;

        Node expected0 = new Node(7);
        Node expected1 = new Node(13);
        Node expected2 = new Node(11);
        Node expected3 = new Node(10);
        Node expected4 = new Node(1);

        expected0.next = expected1;
        expected1.next = expected2;
        expected2.next = expected3;
        expected3.next = expected4;
        expected4.next = null;

        expected0.random = null;
        expected1.random = expected0;
        expected2.random = expected4;
        expected3.random = expected2;
        expected4.random = expected0;

        assertEquals(expected0, new CopyListWithRandomPointer().copyRandomList(input0));
    }

    @Test
    public void example2Test() {
        Node input0 = new Node(1);
        Node input1 = new Node(2);

        input0.next = input1;
        input1.next = null;

        input0.random = input0;
        input1.random = input1;

        Node expected0 = new Node(1);
        Node expected1 = new Node(2);

        expected0.next = expected0;
        expected1.next = expected1;

        expected0.random = expected0;
        expected1.random = expected1;

        assertEquals(expected0, new CopyListWithRandomPointer().copyRandomList(input0));
    }

    @Test
    public void example3Test() {
        Node input0 = new Node(3);
        Node input1 = new Node(3);
        Node input2 = new Node(3);

        input0.next = input1;
        input1.next = input2;
        input2.next = null;

        input0.random = null;
        input1.random = input0;
        input2.random = null;

        Node expected0 = new Node(3);
        Node expected1 = new Node(3);
        Node expected2 = new Node(3);

        expected0.next = expected1;
        expected1.next = expected2;
        expected2.next = null;

        expected0.random = null;
        expected1.random = expected0;
        expected2.random = null;

        assertEquals(expected0, new CopyListWithRandomPointer().copyRandomList(input0));
    }
}
