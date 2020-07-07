import java.util.*;

class ReconstructItinerary {
    Map<String, PriorityQueue<String>> adjList = new HashMap<>();
    LinkedList<String> route = new LinkedList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0);
            String dest = ticket.get(1);
            PriorityQueue<String> lst = adjList.getOrDefault(src, new PriorityQueue<>());
            lst.add(dest);
            adjList.put(src, lst);
//            adjList.computeIfAbsent(src, k -> new PriorityQueue()).add(dest);
        }
        dfs("JFK");
        return route;
    }

    private void dfs(String v){
        while (adjList.containsKey(v) && !adjList.get(v).isEmpty()) {
            dfs(adjList.get(v).poll());
        }
        route.addFirst(v);
    }
    
    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
//        tickets.add(Arrays.asList("MUC", "LHR"));
//        tickets.add(Arrays.asList("JFK", "MUC"));
//        tickets.add(Arrays.asList("SFO", "SJC"));
//        tickets.add(Arrays.asList("LHR", "SFO"));

        tickets.add(Arrays.asList("JFK","SFO"));
        tickets.add(Arrays.asList("JFK","ATL"));
        tickets.add(Arrays.asList("SFO","ATL"));
        tickets.add(Arrays.asList("ATL","JFK"));
        tickets.add(Arrays.asList("ATL","SFO"));

        List<String> ans = new ReconstructItinerary().findItinerary(tickets);
        System.out.println(Arrays.toString(ans.toArray()));
    }
}
