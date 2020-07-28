import java.util.HashSet;
import java.util.Set;

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
class SecondMinimumNodeInABinaryTree {

    // https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        preorder(root, set);
        Integer min1 = null, min2 = null;
        for (Integer num : set) {
            if (min1 == null || num < min1) {
                min2 = min1;
                min1 = num;
            } else if (min2 == null || num < min2) {
                min2 = num;
            }
        }

        return min2 != null ? min2 : -1;
    }

    private void preorder(TreeNode root, Set<Integer> set) {
        if (root != null) {
            set.add(root.val);
            preorder(root.left, set);
            preorder(root.right, set);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println(new SecondMinimumNodeInABinaryTree().findSecondMinimumValue(root));
    }
}