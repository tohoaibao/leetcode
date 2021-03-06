/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NaryTreePreorderTraversal {

    // https://leetcode.com/problems/n-ary-tree-preorder-traversal/
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(Node root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            for (Node child : root.children) {
                preorder(child, res);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Node> n1 = new ArrayList<>();
        ArrayList<Node> n2 = new ArrayList<>();
        ArrayList<Node> n3 = new ArrayList<>();
        ArrayList<Node> n4 = new ArrayList<>();
        ArrayList<Node> n5 = new ArrayList<>();
        ArrayList<Node> n6 = new ArrayList<>();

        Node node1 = new Node(1, n1);
        Node node2 = new Node(2, n2);
        Node node3 = new Node(3, n3);
        Node node4 = new Node(4, n4);
        Node node5 = new Node(5, n5);
        Node node6 = new Node(6, n6);

        n1.add(node3);
        n1.add(node2);
        n1.add(node4);

        n3.add(node5);
        n3.add(node6);

        System.out.println(Arrays.toString(new NaryTreePreorderTraversal().preorder(node1).toArray()));
    }
}