package leetcode150.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Integer, List<Integer>> nodeToNeighbors = new HashMap<>();
        createNodeToNeighbors(node, nodeToNeighbors);

        List<Node> newNodes = nodeToNeighbors.keySet().stream().map(Node::new).toList();
        for (Node current : newNodes) current.neighbors = newNodes.stream().filter(n -> nodeToNeighbors.get(current.val).contains(n.val)).toList();

        return newNodes.getFirst();
    }

    private void createNodeToNeighbors(Node node, Map<Integer, List<Integer>> map) {
        if (map.containsKey(node.val)) return;
        map.put(node.val, node.neighbors.stream().map(n -> n.val).toList());
        for (Node neighbor : node.neighbors) createNodeToNeighbors(neighbor, map);
    }
}
