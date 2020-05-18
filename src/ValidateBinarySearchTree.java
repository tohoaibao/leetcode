public class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer lower, Integer upper) {
        if (root == null) return true;

        int val = root.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;
        if (!isValidBST(root.right, val, upper)) return false;
        if (!isValidBST(root.left, lower, val)) return false;

        return true;
    }

    public static void main(String[] args) {
        /*
                5
              /   \
             1     8
                 /   \
                6     9
         */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        System.out.println(new Solution().isValidBST(root));
    }
}
