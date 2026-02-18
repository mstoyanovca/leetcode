package top_interview_150.linked_list;

import java.util.Objects;

public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return val == node.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next != null ? next.val : 0, random != null ? random.val : 0);
    }
}
