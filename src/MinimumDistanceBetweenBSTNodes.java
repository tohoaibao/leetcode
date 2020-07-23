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
class MinimumDistanceBetweenBSTNodes {
    int res = Integer.MAX_VALUE;
    Integer prev = null;
    public int minDiffInBST(TreeNode root) {
        if (root != null) {
            // BST inorder
            minDiffInBST(root.left);
            if (prev != null) {
                res = Math.min(res, root.val - prev);
            }
            prev = root.val;
            minDiffInBST(root.right);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);

        System.out.println(new MinimumDistanceBetweenBSTNodes().minDiffInBST(root));
    }
}