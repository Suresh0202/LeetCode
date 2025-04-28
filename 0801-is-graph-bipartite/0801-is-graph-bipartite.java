import java.util.*;

class Solution {
    public boolean dfs(int x, int col, List<List<Integer>> adj, int vis[]) {
        vis[x] = col;
        for (int i : adj.get(x)) {
            if (vis[i] == -1) {
                if (!dfs(i, 1 - col, adj, vis)) {
                    return false;
                }
            } else if (vis[i] == col) {
                return false;
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int neighbor : graph[i]) {
                adj.get(i).add(neighbor);
            }
        }
        int vis[] = new int[n];
        Arrays.fill(vis, -1);
        for (int i = 0; i < n; i++) {
            if (vis[i] == -1) {
                if (!dfs(i, 0, adj, vis)) {
                    return false;
                }
            }
        }
        return true;
    }
}
