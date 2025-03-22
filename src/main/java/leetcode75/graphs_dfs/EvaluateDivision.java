package leetcode75.graphs_dfs;

import java.util.*;

// problem 46:
public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = createGraph(equations, values);
        double[] result = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String startNode = queries.get(i).get(0);
            String targetNode = queries.get(i).get(1);
            result[i] = dfs(startNode, targetNode, graph, new HashSet<>());
        }

        return result;
    }

    private double dfs(String startNode, String targetNode, Map<String, Map<String, Double>> graph, Set<String> visited) {
        if (!graph.containsKey(startNode)) return -1.0;
        if (graph.get(startNode).containsKey(targetNode)) return graph.get(startNode).get(targetNode);
        visited.add(startNode);
        // nodes startNode points to:
        for (Map.Entry<String, Double> transitive : graph.get(startNode).entrySet()) {
            if (!visited.contains(transitive.getKey())) {
                double weight = dfs(transitive.getKey(), targetNode, graph, visited);
                if (weight != -1.0) return transitive.getValue() * weight;
            }
        }

        return -1.0;
    }

    private Map<String, Map<String, Double>> createGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        // equations = [["a","b"],["b","c"]], values = [2.0,3.0]
        for (int i = 0; i < equations.size(); i++) {  // i = 0
            String key0 = equations.get(i).get(0);  // a
            String key1 = equations.get(i).get(1);  // b

            graph.putIfAbsent(key0, new HashMap<>());  // a -> new HashMap()
            graph.get(key0).put(key1, values[i]);      // a -> (b -> 2.0)
            graph.putIfAbsent(key1, new HashMap<>());  // b -> new HashMap()
            graph.get(key1).put(key0, 1 / values[i]);  // b -> (a -> 0.5)
        }
        return graph;
    }
}
