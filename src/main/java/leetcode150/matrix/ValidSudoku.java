package leetcode150.matrix;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Integer> subBox0Map = new HashMap<>();
        Map<Integer, Integer> subBox1Map = new HashMap<>();
        Map<Integer, Integer> subBox2Map = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            Map<Integer, Integer> rowMap = new HashMap<>();
            Map<Integer, Integer> columnMap = new HashMap<>();
            for (int c = 0; c < 9; c++) {
                int cell = Character.getNumericValue(board[r][c]);
                if (cell != -1) {
                    if (rowMap.containsKey(cell)) return false;
                    rowMap.put(cell, 1);
                }

                int columnCell = Character.getNumericValue(board[c][r]);
                if (columnCell != -1) {
                    if (columnMap.containsKey(columnCell)) return false;
                    columnMap.put(columnCell, 1);
                }

                if (c == 0 && (r == 0 || r == 3 || r == 6)) {
                    subBox0Map = new HashMap<>();
                    subBox1Map = new HashMap<>();
                    subBox2Map = new HashMap<>();
                }
                if (c < 3) {
                    if (cell != -1) {
                        if (subBox0Map.containsKey(cell)) return false;
                        subBox0Map.put(cell, 1);
                    }
                } else if (c < 6) {
                    if (cell != -1) {
                        if (subBox1Map.containsKey(cell)) return false;
                        subBox1Map.put(cell, 1);
                    }
                } else {
                    if (cell != -1) {
                        if (subBox2Map.containsKey(cell)) return false;
                        subBox2Map.put(cell, 1);
                    }
                }
            }
        }

        return true;
    }
}
