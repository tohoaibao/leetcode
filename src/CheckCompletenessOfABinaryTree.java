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
class CheckCompletenessOfABinaryTree {

    // https://leetcode.com/problems/check-completeness-of-a-binary-tree/
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.peek() != null) {
            TreeNode node = q.poll();
            q.add(node.left);
            q.add(node.right);
        }
        while (!q.isEmpty() && q.peek() == null) {
            q.poll();
        }

        return q.isEmpty();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(6);

        System.out.println(new CheckCompletenessOfABinaryTree().isCompleteTree(root));
    }
}