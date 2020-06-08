import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CloneGraph {

    private Map<Integer, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        return clone(node);
    }

    private Node clone(Node node) {
        if (map.containsKey(node.val)) return map.get(node.val);
        Node copy = new Node(node.val);
        map.put(copy.val, copy);
        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(clone(neighbor));
        }
        return copy;
    }

    public static void main(String[] args) {
        ArrayList<Node> n1 = new ArrayList<>();
        ArrayList<Node> n2 = new ArrayList<>();
        ArrayList<Node> n3 = new ArrayList<>();
        ArrayList<Node> n4 = new ArrayList<>();


        Node node1 = new Node(1, n1);
        Node node2 = new Node(2, n2);
        Node node3 = new Node(3, n3);
        Node node4 = new Node(4, n4);

        n1.add(node2);
        n1.add(node4);

        n2.add(node1);
        n2.add(node3);

        n3.add(node2);
        n3.add(node4);

        n4.add(node1);
        n4.add(node3);

        Node g = new CloneGraph().cloneGraph(node1);
        System.out.println();

    }
}