package leetcode150.array_string;

import java.util.HashMap;
import java.util.Map;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        int n = s.length();
        if (n == 1 || numRows == 1 || numRows > n) return s;
        StringBuilder result = new StringBuilder();

        // time complexity O(n)
        // space complexity O(n)
        for (int row = 0; row < numRows; row++) {
            // first row:
            if (row == 0) for (int i = 0; i < n; i += 2 * numRows - 2) result.append(s.charAt(i));
            // middle rows:
            if (row > 0 && row < numRows - 1) {
                int i = row;
                result.append(s.charAt(i));
                while (true) {
                    i += 2 * numRows - 2 * row - 2;
                    if (i >= n) break;
                    result.append(s.charAt(i));
                    i += 2 * row;
                    if (i >= n) break;
                    result.append(s.charAt(i));
                }
            }
            // last row:
            if (row == numRows - 1) for (int i = numRows - 1; i < n; i += 2 * numRows - 2) result.append(s.charAt(i));
        }

        return result.toString();
    }

    public String convertBruteForce(String s, int numRows) {
        int n = s.length();
        Map<Integer, String> map = new HashMap<>();

        int i = 0;
        while (i < n) {
            for (int r = 0; r < numRows; r++) {
                if (map.containsKey(r)) {
                    map.put(r, map.get(r) + s.charAt(i));
                } else {
                    map.put(r, String.valueOf(s.charAt(i)));
                }
                i++;
                if (i == n) break;
            }
            if (i == n) break;
            for (int r = numRows - 2; r > 0; r--) {
                if (map.containsKey(r)) {
                    map.put(r, map.get(r) + s.charAt(i));
                } else {
                    map.put(r, String.valueOf(s.charAt(i)));
                }
                i++;
                if (i == n) break;
            }
            if (i == n) break;
        }

        StringBuilder result = new StringBuilder();
        for (String v : map.values()) result.append(v);

        return result.toString();
    }
}
