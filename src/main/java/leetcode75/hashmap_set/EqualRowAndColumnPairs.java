package leetcode75.hashmap_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int occurrences = 0;

        // grid is an n by n square matrix:
        int n = grid.length;
        List<List<Integer>> rows = new ArrayList<>();
        List<List<Integer>> columns = new ArrayList<>();
        Map<List<Integer>, Integer> rowMap = new HashMap<>();
        Map<List<Integer>, Integer> columnMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            rows.add(new ArrayList<>());
            columns.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rows.get(i).add(grid[i][j]);
                columns.get(j).add(grid[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            rowMap.put(rows.get(i), rowMap.getOrDefault(rows.get(i), 0) + 1);
            columnMap.put(columns.get(i), columnMap.getOrDefault(columns.get(i), 0) + 1);
        }

        for (List<Integer> row : rowMap.keySet()) {
            occurrences += rowMap.get(row) * columnMap.getOrDefault(row, 0);
        }

        return occurrences;
    }
}
