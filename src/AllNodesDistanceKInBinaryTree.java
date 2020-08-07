import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class AllNodesDistanceKInBinaryTree {

    // https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
    Map<TreeNode, Integer> map = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> ans = new ArrayList<>();
        // find target node first and store the distance in that path that we could use it later directly
        find(root, target);
        dfs(root, target, K, map.get(root), ans);
        return ans;
    }

    private void dfs(TreeNode root, TreeNode target, int K, int length, List<Integer> ans) {
        if (root == null) return;
        if (map.containsKey(root)) {
            length = map.get(root);
        }
        if (length == K) {
            ans.add(root.val);
        }
        dfs(root.left, target, K, length + 1, ans);
        dfs(root.right, target, K, length + 1, ans);
    }

    private int find(TreeNode root, TreeNode target) {
        if (root == null) return -1;
        if (root == target) {
            map.put(root, 0);
            return 0;
        }
        int left = find(root.left, target);
        if (left >= 0) {
            map.put(root, left + 1);
            return left + 1;
        }
        int right = find(root.right, target);
        if (right >= 0) {
            map.put(root, right + 1);
            return right + 1;
        }

        return -1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode target = new TreeNode(5);
        root.left = target;
        target.left = new TreeNode(6);
        target.right = new TreeNode(2);
        target.right.left = new TreeNode(7);
        target.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        int k = 2;
        System.out.println(new AllNodesDistanceKInBinaryTree().distanceK(root, target, k));
    }
}