package leetcode150.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        createGraph(graph, equations, values);

        return null;
    }

    private void createGraph(Map<String, Map<String, Double>> graph, List<List<String>> equations, double[] values) {
        for (int i = 0; i < equations.size(); i++) {
            String dividend = equations.get(i).getFirst();
            String divisor = equations.get(i).get(1);
            double result = values[i];

            Map<String, Double> newNode = new HashMap<>();
            newNode.put(divisor, result);

            if (!graph.containsKey(dividend)) {
                graph.put(dividend, newNode);
            } else {
                Map<String, Double> existingNode = graph.get(dividend);
                existingNode.put(divisor, result);
                graph.put(dividend, existingNode);
            }

            Map<String, Double> reverseNode = new HashMap<>();
            reverseNode.put(dividend, 1 / result);

            if (!graph.containsKey(divisor)) {
                graph.put(divisor, reverseNode);
            } else {
                Map<String, Double> existingNode = graph.get(divisor);
                existingNode.put(dividend, 1 / result);
                graph.put(divisor, existingNode);
            }
        }
    }
}
