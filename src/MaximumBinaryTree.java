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
class MaximumBinaryTree {

    // https://leetcode.com/problems/maximum-binary-tree/
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;
        int maxI = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > nums[maxI]) {
                maxI = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxI]);
        root.left = build(nums, left, maxI - 1);
        root.right = build(nums, maxI + 1, right);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        System.out.println(new MaximumBinaryTree().constructMaximumBinaryTree(nums));
    }
}