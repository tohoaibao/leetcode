import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class NetworkDelayTime {

    // https://leetcode.com/problems/network-delay-time/
    Map<Integer, Integer> dist;
    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        // times[i] = (u, v, w)
        // u is the source node, v is the target node, and w is the time travel
        for (int [] edge: times) {
            if (!graph.containsKey(edge[0])){
                graph.put(edge[0], new ArrayList<>());
            }
            graph.get(edge[0]).add(new int[] {edge[1], edge[2]});
        }
        dist = new HashMap<>();
        for (int node = 1; node <= N; ++node) {
            dist.put(node, Integer.MAX_VALUE);
        }
        dist.put(K, 0);
        boolean seen[] = new boolean[N + 1];
        while (true) {
            int candNode = -1;
            int candDist = Integer.MAX_VALUE;
            for (int i = 1; i <= N; ++i) {
                if (!seen[i] && dist.get(i) < candDist) {
                    candDist = dist.get(i);
                    candNode = i;
                }
            }
            if (candNode < 0) break;
            seen[candNode] = true;
            if (graph.containsKey(candNode)) {
                for (int[] info: graph.get(candNode)) {
                    dist.put(info[0], Math.min(dist.get(info[0]), dist.get(candNode) + info[1]));
                }
            }
        }
        int ans = 0;
        for (int cand: dist.values()) {
            if (cand == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, cand);
        }

        return ans;
    }

    public static void main(String[] args) {
        int times[][] = {{2,1,1},{2,3,1},{3,4,1}};
        int N = 4, K = 2;
        System.out.println(new NetworkDelayTime().networkDelayTime(times, N, K));
    }
}