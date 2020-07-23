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
class MinimumAbsoluteDifferenceInBST {
    int res = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        if (root != null) {
            // BST inorder
            getMinimumDifference(root.left);
            if (prev != null) {
                res = Math.min(res, root.val - prev.val);
            }
            prev = root;
            getMinimumDifference(root.right);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);

        System.out.println(new MinimumAbsoluteDifferenceInBST().getMinimumDifference(root));
    }
}