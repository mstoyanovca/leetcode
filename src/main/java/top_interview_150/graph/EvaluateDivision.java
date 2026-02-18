package top_interview_150.graph;

import java.util.*;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        createGraph(graph, equations, values);

        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) result[i] = dfs(graph, queries.get(i), new HashSet<>());

        return result;
    }

    private void createGraph(Map<String, Map<String, Double>> graph, List<List<String>> equations, double[] values) {
        for (int i = 0; i < equations.size(); i++) {
            String dividend = equations.get(i).getFirst();
            String divisor = equations.get(i).get(1);

            graph.putIfAbsent(dividend, new HashMap<>());
            graph.get(dividend).put(divisor, values[i]);

            graph.putIfAbsent(divisor, new HashMap<>());
            graph.get(divisor).put(dividend, 1 / values[i]);
        }
    }

    private double dfs(Map<String, Map<String, Double>> graph, List<String> query, Set<String> visited) {
        String dividend = query.getFirst();  // a
        String divisor = query.get(1);       // c

        if (!graph.containsKey(dividend)) {
            return -1.0;
        } else if (dividend.equals(divisor)) {
            return 1.0;
        }

        Map<String, Double> node = graph.get(dividend);  // b -> 2.0
        if (node.containsKey(divisor)) return node.get(divisor);

        visited.add(dividend);
        for (Map.Entry<String, Double> mapEntry : node.entrySet()) {
            if (!visited.contains(mapEntry.getKey())) {
                double weight = dfs(graph, List.of(mapEntry.getKey(), divisor), visited);
                if (weight != -1.0) return mapEntry.getValue() * weight;
            }
        }

        return -1.0;
    }
}
