public class KthSmallestElementInABST {

    // https://leetcode.com/problems/kth-smallest-element-in-a-bst/
    int i = 0;
    int ans = -1;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return ans;
    }

    private void inOrder(TreeNode root, int k) {
        if (root == null) return;
        inOrder(root.left, k);
        if (++i == k) {
            ans = root.val;
            return;
        }
        inOrder(root.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(root);

        int k = 1;
        System.out.println(new KthSmallestElementInABST().kthSmallest(root, k));
    }
}
