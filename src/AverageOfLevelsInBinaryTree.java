import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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
class AverageOfLevelsInBinaryTree {

    // https://leetcode.com/problems/average-of-levels-in-binary-tree/
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int level = q.size();
            double sum = 0;
            for (int i = 0; i < level; i++) {
                TreeNode node = q.poll();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                sum += node.val;
            }
            res.add(sum/level);
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(Arrays.toString(new AverageOfLevelsInBinaryTree().averageOfLevels(root).toArray()));
    }
}