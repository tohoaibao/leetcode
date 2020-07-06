import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PossibleBipartition {
    // https://leetcode.com/problems/possible-bipartition/
    ArrayList<Integer>[] graph;
    Map<Integer, Integer> color;
    public boolean possibleBipartition(int N, int[][] dislikes) {
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : dislikes) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        color = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            if (!color.containsKey(i) && !dfs(i, 0))
                return false;
        }

        return true;
    }

    private boolean dfs(int node, int c) {
        if (color.containsKey(node)) {
            return color.get(node) == c;
        }
        color.put(node, c);

        for (int nei : graph[node]) {
            // switch colors (i.e. from 0 to 1 and 1 to 0)
            if (!dfs(nei, c ^ 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] dislikes = {{1,2},{1,3},{2,4}};
        int N = 4;
        System.out.println(new PossibleBipartition().possibleBipartition(4, dislikes));
    }
}