package leet_code_75.graphs_dfs;

// problem 44:
public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        // isConnected is a square symmetric array:
        int[] visited = new int[isConnected.length];
        int provinces = 0;

        // iterate all cities, this scans rows:
        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                provinces++;
                // for each city, check which other cities it is connected to:
                dfs(isConnected, visited, i);
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, int[] visited, int i) {
        // this scans columns for a given row:
        for (int j = 0; j < isConnected[i].length; j++) {
            if (isConnected[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(isConnected, visited, j);
            }
        }
    }
}
