package leetcode75.graphs_dfs;

// problem 44:
public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int[] visited = new int[isConnected.length];
        int provinces = 0;

        // isConnected is a square symmetric array;
        // iterate all cities:
        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                provinces++;
                // check which city it is connected with:
                for (int j = 0; j < isConnected[i].length; j++) {
                    if (isConnected[i][j] == 1) {
                        visited[j] = 1;
                    }
                }
            }
        }

        return provinces;
    }
}
