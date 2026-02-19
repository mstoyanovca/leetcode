package top_interview_150.binary_tree;

import java.util.Objects;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(int val, Node left, Node right, Node next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Node node)) return false;
        return val == node.val;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(val);
    }
}
