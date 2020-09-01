import java.util.LinkedList;
import java.util.Queue;

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
class MaximumLevelSumOfABinaryTree {

    // https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
    public int maxLevelSum(TreeNode root) {
        int ans = 0;
        long maxSum = Long.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            level++;
            long sum = 0;
            for (int i = 0; i < q.size(); ++i) {
                TreeNode node = q.remove();
                sum += node.val;
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            if (sum > maxSum) {
                maxSum = sum;
                ans = level;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);
        root.right = new TreeNode(0);

        System.out.println(new MaximumLevelSumOfABinaryTree().maxLevelSum(root));
    }
}