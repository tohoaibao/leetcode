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
class ConstructBinarySearchTreeFromPreorderTraversal {

    // https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for (int x : preorder) {
            root = buildTree(root, x);
        }
        return root;
    }

    private TreeNode buildTree(TreeNode root, int data) {
        if (root==null) {
            root = new TreeNode(data);
        } else if (data < root.val) {
            root.left = buildTree(root.left, data);
        } else {
            root.right = buildTree(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        System.out.println(new ConstructBinarySearchTreeFromPreorderTraversal().bstFromPreorder(preorder));
    }
}