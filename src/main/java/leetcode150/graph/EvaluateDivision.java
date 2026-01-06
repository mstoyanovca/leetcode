package leetcode150.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        createGraph(graph, equations, values);

        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) result[i] = calculateResult(graph, queries.get(i));

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

    private double calculateResult(Map<String, Map<String, Double>> graph, List<String> query) {
        String dividend = query.getFirst();  // a
        String divisor = query.get(1);       // c

        if (!graph.containsKey(dividend)) {
            return -1.0;
        } else if (dividend.equals(divisor)) {
            return 1.0;
        }

        Map<String, Double> node = graph.get(dividend);  // b -> 2.0
        if (node.containsKey(divisor)) {
            return node.get(divisor);
        } else {
            for (Map.Entry<String, Double> tuple : node.entrySet()) {
                //return tuple.getValue() * calculateResult(graph, List.of(tuple.getKey(), divisor));
            }
        }

        return -1.0;
    }
}














































