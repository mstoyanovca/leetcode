package top_interview_150.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PopulateNextRightPointer2Test {
    @Test
    public void example1Test() {
        Node root = new Node(1,
                new Node(2, new Node(4), new Node(5)),
                new Node(3, null, new Node(7)));

        Node expected0 = new Node(1);

        Node expected1 = new Node(2);
        Node expected2 = new Node(3);
        expected1.next = expected2;

        expected0.left = expected1;
        expected0.right = expected2;

        Node expected3 = new Node(4);
        Node expected4 = new Node(5);
        expected3.next = expected4;

        expected1.left = expected3;
        expected1.right = expected4;

        expected2.right = new Node(7);

        Node actual = new PopulateNextRightPointer2().connect(root);

        assertEquals(expected0, actual);
    }

    @Test
    public void example2Test() {
        assertNull(new PopulateNextRightPointer2().connect(null));
    }
}
