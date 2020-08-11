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
class IncreasingOrderSearchTree {

    // https://leetcode.com/problems/increasing-order-search-tree/
    TreeNode ans = new TreeNode(0);
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return ans.right;
    }


    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);

            // Insert to right
            TreeNode curr = ans;
            while (curr.right != null) {
                curr = curr.right;
            }
            curr.right = new TreeNode(root.val);

            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
        System.out.println(new IncreasingOrderSearchTree().increasingBST(root));
    }
}