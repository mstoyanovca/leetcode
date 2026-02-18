package leet_code_75.graphs_dfs;

import java.util.ArrayList;
import java.util.List;

// problem 45:
public class ReorderRoutes {
    public int minReorder(int n, int[][] connections) {
        // connections.length is the number of connections between cities;
        // connections.length + 1 is the number of cities;
        List<List<Integer>> cityConnections = new ArrayList<>();
        // a list per city:
        for (int i = 0; i < connections.length + 1; i++) cityConnections.add(new ArrayList<>());
        // a list of the cities each city points to:
        for (var connection : connections) {
            cityConnections.get(connection[0]).add(connection[1]);   // direction from -> to
            cityConnections.get(connection[1]).add(-connection[0]);  // direction to -> from
        }

        return dfs(cityConnections, new boolean[connections.length + 1], 0);
    }

    private int dfs(List<List<Integer>> cityConnections, boolean[] visited, int city) {
        visited[city] = true;
        int changed = 0;

        for (var nextCity : cityConnections.get(city)) {
            if (!visited[Math.abs(nextCity)]) {
                changed += dfs(cityConnections, visited, Math.abs(nextCity)) + (nextCity > 0 ? 1 : 0);
            }
        }

        return changed;
    }
}
