import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindModeInBinarySearchTree {

    // https://leetcode.com/problems/find-mode-in-binary-search-tree/
    int max;
    public int[] findMode(TreeNode root) {
        List<Integer> dups = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        max = Integer.MIN_VALUE;
        preorder(root, map);
        for (Integer k : map.keySet()) {
            if (map.get(k) == max) {
                dups.add(k);
            }
        }

        int n = dups.size();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = dups.get(i);
        }

        return res;
    }

    public void preorder(TreeNode root, Map<Integer, Integer> map) {
        if (root != null) {
            int count = map.getOrDefault(root.val, 0) + 1;
            map.put(root.val, count);
            if (count > max) {
                max = count;
            }
            preorder(root.left, map);
            preorder(root.right, map);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        System.out.println(Arrays.toString(new FindModeInBinarySearchTree().findMode(root)));
    }
}