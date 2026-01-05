package leetcode150.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CloneGraphTest {
    @Test
    public void example1Test() {
        Node node0 = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);

        node0.neighbors = List.of(node1, node3);
        node1.neighbors = List.of(node2, node0);
        node2.neighbors = List.of(node3, node1);
        node3.neighbors = List.of(node0, node2);

        assertEquals(node0, new CloneGraph().cloneGraph(node0));
    }

    @Test
    public void example2Test() {
        Node node = new Node(1);

        assertEquals(node, new CloneGraph().cloneGraph(node));
    }

    @Test
    public void example3Test() {
        assertNull(new CloneGraph().cloneGraph(null));
    }
}
