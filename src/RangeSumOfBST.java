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
class RangeSumOfBST {
    // https://leetcode.com/problems/range-sum-of-bst/
    int ans;
    public int rangeSumBST(TreeNode root, int L, int R) {
        ans=0;
        dfs(root, L, R);
        return ans;
    }

    private void dfs(TreeNode root, int L, int R) {
        if (root != null) {
            if (root.val >= L && root.val <= R) {
                ans += root.val;
            }
            if (root.val > L) dfs(root.left, L, R);
            if (root.val < R) dfs(root.right, L, R);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(18);
        int L = 7, R = 15;
        System.out.println(new RangeSumOfBST().rangeSumBST(root, L, R));
    }
}