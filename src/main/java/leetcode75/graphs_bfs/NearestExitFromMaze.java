package leetcode75.graphs_bfs;

import java.util.LinkedList;
import java.util.Queue;

// problem 46:
public class NearestExitFromMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        int steps = 0;
        // mark entrance as visited:
        maze[entrance[0]][entrance[1]] = '+';
        Queue<int[]> queue = new LinkedList<>();
        queue.add(entrance);
        // left, right, up, down:
        int[][] directions = new int[][]{{-1, 0}, {0, 1}, {-1, 0}, {1, 0}};

        while (!queue.isEmpty()) {
            steps++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.remove();
                // try to move one step left, right, up and down;
                // add to queue if possible, or skip;
                for (int[] direction : directions) {
                    int[] newPosition = {current[0] + direction[0], current[1] + direction[1]};
                    if (isExit(newPosition, maze)) return steps;
                    if (isEmpty(newPosition, maze)) {
                        maze[newPosition[0]][newPosition[1]] = '+';
                        queue.add(newPosition);
                    }
                }
            }
        }

        return -1;
    }

    private boolean isExit(int[] position, char[][] maze) {
        int x = position[0];
        int y = position[1];
        int rows = maze.length;
        int columns = maze[0].length;

        return isEmpty(position, maze) && (x == 0 || x == rows - 1 || y == 0 || y == columns - 1);
    }

    private boolean isEmpty(int[] position, char[][] maze) {
        int x = position[0];
        int y = position[1];
        int rows = maze.length;
        int columns = maze[0].length;

        return x >= 0 && x < rows && y >= 0 && y < columns && maze[x][y] == '.';
    }
}
