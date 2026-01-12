package leetcode150.graph_bfs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class SnakesAndLadders {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] minRolls = new int[n * n + 1];
        Arrays.fill(minRolls, -1);
        Queue<Integer> bfs = new ArrayDeque<>();
        minRolls[1] = 0;
        bfs.add(1);

        while (!bfs.isEmpty()) {
            int current = bfs.remove();

            for (int i = 1; i <= 6 && current + i <= n * n; i++) {
                int next = current + i;

                int row = n - 1 - (next - 1) / n;
                int col = (next - 1) % n;
                int value = board[row][(row % 2 == 0) ? (n - 1 - col) : col];
                int newValue = (value > 0 ? value : next);
                if (newValue == n * n) return minRolls[current] + 1;
                if (minRolls[newValue] == -1) {
                    minRolls[newValue] = minRolls[current] + 1;
                    bfs.add(newValue);
                }
            }
        }

        return -1;
    }
}
